/**
 * @param {number[][]} edges
 * @param {number[][]} queries
 * @return {number[]}
 */
var assignEdgeWeights = function(edges, queries) {
    const len = edges.length + 1
    // apply sqrt decomposition
    const unitSize = ~~Math.floor(len)

    // build the graph
    function Node(i) {
        this.i = i
        this.parent = null

        this.neighs = []
        this.built = false
        this.children = []

        this.depth = -1
        this.pathlet = []
    }

    const nodes = new Array(len)
    for (const i of nodes.keys())
        nodes[i] = new Node(i)
    
    for (const [f, t] of edges) {
        const F = nodes[f - 1], T = nodes[t - 1]
        F.neighs.push(T)
        T.neighs.push(F)
    }

    // build the tree from the graph
    function build(node, parent) {
        node.built = true
        const { children } = node

        for (const neigh of node.neighs) {
            if (!neigh.built) {
                build(neigh)
                neigh.parent = node
                children.push(neigh)
            }
        }
    }
    const root = nodes[0]
    build(root)


    const pathSF = [] // it stretches and shrinks along the way of recursion
    function dfs(node, depthSF) {
        // mark its depth
        node.depth = depthSF
        const { pathlet } = node

        pathSF.push(node)
        for (let i = 0, size = pathSF.length; i < size; i += unitSize) {
            pathlet.push(pathSF[i])
        }
        const last = pathlet.at(-1)
        if (last !== node)
            pathlet.push(node) // mark its pathlet, with sqrt composition

        const nextDepth = 1 + depthSF
        for (const child of node.children) {
            dfs(child, nextDepth)
        }

        pathSF.pop()
    }
    dfs(root, 0)


    const memo = new Array(len)
    for (const p of memo.keys())
        memo[p] = []

    // get the distance from p to q, 
    // in sqrt(n) time
    function getDistance(p, q) {
        if (p === q)    return 0

        const ext = memo[p][q]
        if (ext !== undefined)  return ext

        const P = nodes[p], Q = nodes[q]
        let pathP = P.pathlet, pathQ = Q.pathlet
        if (pathP.length > pathQ.length) {
            ;[p, q] = [q, p];
            ;[pathP, pathQ] = [pathQ, pathP];
        }
        const depthP = P.depth, depthQ = Q.depth

        const lenP = pathP.length, lenQ = pathQ.length
        let low = 0, high = lenP - 1
        // find latest low where 
        // pathP[low] === pathQ[low]
        while (low < high) {
            const mid = (1 + low + high) >> 1
            if (pathP[mid] === pathQ[mid])
                low = mid
            else
                high = mid - 1
        }

        // with the help of the pathlets of nodes, 
        // find the least common ancestor of the 
        // two nodes in O(sqrt(n)) time
        let A = pathP[Math.min(1 + low, lenP - 1)], 
            B = pathQ[Math.min(1 + low, lenQ - 1)]
        const depthDiff = Math.abs(A.depth - B.depth)
        if (A.depth < B.depth) {
            for (let i = 0; i < depthDiff; i++)
                B = B.parent
        } else if (A.depth > B.depth) {
            for (let i = 0; i < depthDiff; i++)
                A = A.parent
        }

        for (; A !== B; A = A.parent, B = B.parent);

        // now A is the least common ancestor
        const result = depthP + depthQ - A.depth * 2
        return memo[p][q] = result
    }


    // store powers of 2
    // special: let 2 ** (-1) be 0 to handle the corner case
    const powers = new Array(len)
    powers[-1] = 0
    const modMe = 1e9 + 7
    for (let i = 0, x = 1; i < len; i++, x = (x * 2) % modMe) {
        powers[i] = x
    }


    return queries.map(query => {
        const [p, q] = query
        const distance = getDistance(p - 1, q - 1)
        const outcome = powers[distance - 1]
        return outcome
    })
};