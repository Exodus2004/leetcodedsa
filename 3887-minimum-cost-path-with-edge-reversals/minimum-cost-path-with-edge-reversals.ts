function minCost(numberOfNodes: number, edges: number[][]): number {
    const CAN_NOT_REACH_GOAL = -1;
    const graph = createGraph(numberOfNodes, edges);
    const start = 0;
    const goal = numberOfNodes - 1;

    return findMinCostPath(graph, start, goal, CAN_NOT_REACH_GOAL);
};

function findMinCostPath(graph: Map<number, number>[], start: number, goal: number, CAN_NOT_REACH_GOAL: number): number {
    const minHeapCost = new PriorityQueue<Step>((x, y) => x.costFromStart - y.costFromStart);
    const minCostPath = new Array(graph.length).fill(Number.MAX_SAFE_INTEGER);

    minHeapCost.enqueue(new Step(start, 0));
    minCostPath[start] = 0;

    while (!minHeapCost.isEmpty()) {
        const current = minHeapCost.dequeue();

        if (current.ID === goal) {
            return current.costFromStart;
        }
        for (let next of graph[current.ID].keys()) {
            if (minCostPath[next] > current.costFromStart + graph[current.ID].get(next)) {
                minCostPath[next] = current.costFromStart + graph[current.ID].get(next);
                minHeapCost.enqueue(new Step(next, minCostPath[next]));
            }
        }
    }

    return CAN_NOT_REACH_GOAL;
}

function createGraph(numberOfNodes: number, edges: number[][]): Map<number, number>[] {
    const graph = new Array<Map<number, number>>(numberOfNodes);
    for (let i = 0; i < numberOfNodes; ++i) {
        graph[i] = new Map<number, number>();
    }

    for (let [from, to, cost] of edges) {

        if (!graph[from].has(to)) {
            graph[from].set(to, cost);
        }
        if (!graph[to].has(from)) {
            graph[to].set(from, 2 * cost);
        }

        graph[from].set(to, Math.min(graph[from].get(to), cost));
        graph[to].set(from, Math.min(graph[to].get(from), 2 * cost));
    }

    return graph;
}

class Step {

    ID: number;
    costFromStart: number;

    constructor(ID: number, costFromStart: number) {
        this.ID = ID;
        this.costFromStart = costFromStart;
    }
}