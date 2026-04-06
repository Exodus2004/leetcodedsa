function robotSim(commands: number[], obstacles: number[][]): number {
    let x = 0, y = 0, j = 0, result = 0;
    const d = [[0,1],[1,0],[0,-1],[-1,0]]; // Directions for robot to move in

    const ops = new Set<string>();

    for (const [ox, oy] of obstacles) {
        ops.add(`${ox} ${oy}`);
    }

    for (let command of commands) {
        if (command === -1) { // If right
            j = (j + 1) % 4;
        } else if (command === -2) { // If left
            j = (j + 3) % 4;
        } else {
            while (command-- > 0 && !ops.has(`${x + d[j][0]} ${y + d[j][1]}`)) { // Travel how ever many units or until the next position is an obstacle
                x += d[j][0];
                y += d[j][1];
            }
        }
        result = Math.max(result, x * x + y * y); // Calculate the maximum distance
    }
    return result;
}