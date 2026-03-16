function getBiggestThree(grid: number[][]): number[] {
    const width = grid[0].length
    const height = grid.length;
    let biggestThree: number[] = [];

    const evaluateSum = (sum: number): void => {
        if (biggestThree.includes(sum)) {
            return;
        }

        if (biggestThree.length < 3) {
            biggestThree.push(sum);
            return;
        }
    
        const min = Math.min(...biggestThree);
        if (sum > min) {
            biggestThree[biggestThree.indexOf(min)] = sum;
        }
    }

    const inBounds = (x: number, y: number, length: number): boolean => {
        // Check the rhombus edges before trying to get the sum
        return x + length < width && x - length >= 0 &&
               y >= 0 && y < height && (length === 0 || ((length + 1) * 2 - 1) <= height - y);
    }

    const getRhombusSum = (x: number, y: number, length: number): boolean => {
        let total = grid[y][x];

        // Evaluate each edge of the rhombus
        for (let i = 1; i <= length; i++) {
            total += grid[++y][--x];
        }
        for (let i = 1; i <= length; i++) {
            total += grid[++y][++x]
        }
        for (let i = 1; i <= length; i++) {
            total += grid[--y][++x]
        }
        // Evaluate one less cell for the final edge because
        // we don't want to double count the first cell
        for (let i = 1; i < length; i++) {
            total += grid[--y][--x]
        }
        evaluateSum(total);
        return true;
    }

    for (let y = 0; y < height; y++) {
        for (let x = 0; x < width; x++) {
            // Length of each edge
            let length = 0;
            while (inBounds(x, y, length)) {
                getRhombusSum(x, y, length++);
            };
        }
    }

    return biggestThree.sort((a: number, b: number) => b - a);
};