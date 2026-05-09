/**
 * @param {number[][]} grid
 * @param {number} k
 * @return {number[][]}
 */
var rotateGrid = function(grid, k) {

    let m = grid.length;
    let n = grid[0].length;

    let layers = Math.min(m, n) / 2;

    for (let layer = 0; layer < layers; layer++) {

        let nums = [];

        let top = layer;
        let bottom = m - layer - 1;
        let left = layer;
        let right = n - layer - 1;

        for (let j = left; j <= right; j++) {
            nums.push(grid[top][j]);
        }

        for (let i = top + 1; i <= bottom - 1; i++) {
            nums.push(grid[i][right]);
        }

        for (let j = right; j >= left; j--) {
            nums.push(grid[bottom][j]);
        }

        for (let i = bottom - 1; i >= top + 1; i--) {
            nums.push(grid[i][left]);
        }

        let len = nums.length;

        let rotate = k % len;

        let rotated = new Array(len);

        for (let i = 0; i < len; i++) {
            rotated[i] = nums[(i + rotate) % len];
        }

        let idx = 0;

        for (let j = left; j <= right; j++) {
            grid[top][j] = rotated[idx++];
        }

        for (let i = top + 1; i <= bottom - 1; i++) {
            grid[i][right] = rotated[idx++];
        }

        for (let j = right; j >= left; j--) {
            grid[bottom][j] = rotated[idx++];
        }

        for (let i = bottom - 1; i >= top + 1; i--) {
            grid[i][left] = rotated[idx++];
        }
    }

    return grid;
};