var constructProductMatrix = function(grid) {
    let ROWS = grid.length, COLS = grid[0].length;

    let output = new Array(ROWS)
        .fill(0)
        .map(() => new Array(COLS).fill(1));

    let prefix = 1;
    for (let r = 0; r < ROWS; r++) {
        for (let c = 0; c < COLS; c++) {
            output[r][c] = prefix;
            prefix = (prefix * grid[r][c]) % 12345;
        }
    }

    let suffix = 1;
    for (let r = ROWS - 1; r >= 0; r--) {
        for (let c = COLS - 1; c >= 0; c--) {
            output[r][c] = (output[r][c] * suffix) % 12345;
            suffix = (suffix * grid[r][c]) % 12345;
        }
    }

    return output;
};