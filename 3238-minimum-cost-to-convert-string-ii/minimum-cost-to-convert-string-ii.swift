final class Solution {

    final class TrieNode {
        var children: [UInt8: TrieNode] = [:]
        var word: String? = nil
    }

    private func insert(_ root: TrieNode, _ word: String) {
        var cur = root
        let bytes = Array(word.utf8)
        for i in stride(from: bytes.count - 1, through: 0, by: -1) {
            let c = bytes[i]
            if cur.children[c] == nil {
                cur.children[c] = TrieNode()
            }
            cur = cur.children[c]!
        }
        cur.word = word
    }

    private func search(_ root: TrieNode, _ s: [UInt8], _ pos: Int) -> [String] {
        var res = [String]()
        var cur: TrieNode? = root
        var i = pos
        while i >= 0, let node = cur?.children[s[i]] {
            cur = node
            if let w = node.word { res.append(w) }
            i -= 1
        }
        return res
    }

    func minimumCost(
        _ source: String,
        _ target: String,
        _ original: [String],
        _ changed: [String],
        _ cost: [Int]
    ) -> Int {

        var ids = [String: Int]()
        var id = 0

        let root = TrieNode()

        for s in original {
            insert(root, s)
            if ids[s] == nil {
                ids[s] = id
                id += 1
            }
        }
        for s in changed {
            if ids[s] == nil {
                ids[s] = id
                id += 1
            }
        }

        let INF = Int64.max / 4
        var dist = Array(
            repeating: Array(repeating: INF, count: id),
            count: id
        )

        for i in 0..<id { dist[i][i] = 0 }

        for i in 0..<original.count {
            let u = ids[original[i]]!
            let v = ids[changed[i]]!
            dist[u][v] = min(dist[u][v], Int64(cost[i]))
        }

        for k in 0..<id {
            for i in 0..<id where dist[i][k] < INF {
                for j in 0..<id where dist[k][j] < INF {
                    let nd = dist[i][k] + dist[k][j]
                    if nd < dist[i][j] {
                        dist[i][j] = nd
                    }
                }
            }
        }

        let sBytes = Array(source.utf8)
        let tBytes = Array(target.utf8)
        let n = sBytes.count

        var dp = Array(repeating: INF, count: n + 1)
        dp[0] = 0

        for i in 1...n {
            if sBytes[i - 1] == tBytes[i - 1] {
                dp[i] = dp[i - 1]
            }

            let matches = search(root, sBytes, i - 1)
            for w in matches {
                let len = w.utf8.count
                if i - len < 0 { continue }

                let srcSub = String(decoding: sBytes[(i-len)..<i], as: UTF8.self)
                let tgtSub = String(decoding: tBytes[(i-len)..<i], as: UTF8.self)

                guard
                    let u = ids[srcSub],
                    let v = ids[tgtSub],
                    dist[u][v] < INF,
                    dp[i - len] < INF
                else { continue }

                let nd = dp[i - len] + dist[u][v]
                if nd < dp[i] { dp[i] = nd }
            }
        }

        let res = dp[n] >= INF ? -1 : dp[n]
        return res < 0 ? -1 : Int(res)
    }
}