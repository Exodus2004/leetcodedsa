function findRotation(mat: number[][], target: number[][]): boolean {
    function rotate(matrix: number[][]): number[][] {
        const n = matrix.length;
        const rotated = Array.from({ length: n }, () => Array(n).fill(0));

        for (let i = 0; i < n; i++) {
            for (let j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    let current = mat;

    // Check original orientation
    if (JSON.stringify(current) === JSON.stringify(target)) return true;

    // Check 3 more rotations
    for (let i = 1; i < 4; i++) {
        current = rotate(current);
        if (JSON.stringify(current) === JSON.stringify(target)) return true;
    }

    return false;
}