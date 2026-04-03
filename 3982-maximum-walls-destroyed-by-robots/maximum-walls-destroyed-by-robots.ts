function maxWalls(robots: number[], d: number[], walls: number[]): number {
    const n = robots.length;
    const x: [number, number][] = [];
    for (let i = 0; i < n; i++) x.push([robots[i], d[i]]);
    walls.sort((a, b) => a - b);
    x.sort((a, b) => a[0] - b[0]);
    x.push([1e9, 0]);

    function query(l: number, r: number): number {
        if (l > r) return 0;
        const it1 = upperBound(walls, r);
        const it2 = lowerBound(walls, l);
        return it1 - it2;
    }

    const dp: [number, number][] = Array(n).fill(null).map(() => [0, 0]);
    dp[0][0] = query(x[0][0] - x[0][1], x[0][0]);
    if (n > 1) dp[0][1] = query(x[0][0], Math.min(x[1][0] - 1, x[0][0] + x[0][1]));
    else dp[0][1] = query(x[0][0], x[0][0] + x[0][1]);

    for (let i = 1; i < n; i++) {
        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0]) + query(x[i][0], Math.min(x[i + 1][0] - 1, x[i][0] + x[i][1]));

        dp[i][0] = dp[i - 1][0] + query(Math.max(x[i][0] - x[i][1], x[i - 1][0] + 1), x[i][0]);
        let res = dp[i - 1][1]
            + query(Math.max(x[i][0] - x[i][1], x[i - 1][0] + 1), x[i][0])
            - query(Math.max(x[i][0] - x[i][1], x[i - 1][0] + 1), Math.min(x[i - 1][0] + x[i - 1][1], x[i][0] - 1));
        dp[i][0] = Math.max(res, dp[i][0]);
    }
    return Math.max(dp[n - 1][0], dp[n - 1][1]);
}

function lowerBound(arr: number[], target: number): number {
    let l = 0, r = arr.length;
    while (l < r) {
        const m = Math.floor((l + r) / 2);
        if (arr[m] < target) l = m + 1;
        else r = m;
    }
    return l;
}

function upperBound(arr: number[], target: number): number {
    let l = 0, r = arr.length;
    while (l < r) {
        const m = Math.floor((l + r) / 2);
        if (arr[m] <= target) l = m + 1;
        else r = m;
    }
    return l;
}