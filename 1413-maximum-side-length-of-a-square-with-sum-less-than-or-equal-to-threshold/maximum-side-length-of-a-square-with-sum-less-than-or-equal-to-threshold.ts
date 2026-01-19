function maxSideLength(mat: number[][], threshold: number): number {
    if (mat[0].length === 1) return 1;

    let n = mat.length, m = mat[0].length, res = 0;
    let sideMax = Math.min(m, n);

    // 1. Check for 1x1 squares
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (mat[i][j] <= threshold) {
                res = 1;
                break;
            }
        }
        if (res === 1) break;
    }

    // Storage for valid squares: key = side length, value = list of [x, y, sum]
    let map = {
        2: []
    };

    // 2. Build 2x2 squares (The Seed)
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < m - 1; j++) {
            let sum = mat[i][j] + mat[i + 1][j] + mat[i][j + 1] + mat[i + 1][j + 1];
            if (sum <= threshold) {
                map[2].push([i, j, sum]);
                res = 2;
            }
        }
    }

    // 3. Iteratively expand: k -> k+1
    for (let k = 2; k < sideMax; k++) {
        let prev = map[k];
        // If no valid squares of size k exist, we cannot form k+1
        if (!prev || prev.length === 0) break;

        map[k + 1] = [];

        for (let [x, y, prevSum] of prev) {
            // Check boundary for expansion
            if (x + k >= n || y + k >= m) continue;

            let add = 0;

            // Add new bottom row
            for (let j = y; j <= y + k; j++) {
                add += mat[x + k][j];
            }

            // Add new right column (excluding the corner we just added to avoid double count)
            for (let i = x; i < x + k; i++) {
                add += mat[i][y + k];
            }

            let newSum = prevSum + add;

            // If valid, store for next level
            if (newSum <= threshold) {
                map[k + 1].push([x, y, newSum]);
                res = k + 1;
            }
        }
    }

    return res;
};