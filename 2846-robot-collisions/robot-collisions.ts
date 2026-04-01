interface Robot {
    position: number;
    health: number;
    direction: string;
}

function survivedRobotsHealths(positions: number[], healths: number[], directions: string): number[] {
    const robots: Robot[] = [];
    const map = new Map<number, Robot>(); // position to robot mapping

    for (let i = 0; i < healths.length; i++) {
        const position = positions[i];
        const health = healths[i];
        const direction = directions[i];
        const robot = { position, health, direction }
        robots.push(robot);
        map.set(position, robot);
    }
    robots.sort((x, y) => x.position - y.position)

    const stack: Robot[] = [];
    for (const robot of robots) {
        switch (robot.direction) {
            case 'R':
                stack.push(robot)
                break;
            case 'L':
                while (stack.length > 0 && robot.health > 0) {
                    const enemy = stack.pop();
                    if (enemy.health === robot.health) {
                        robot.health = 0;
                        enemy.health = 0;
                    } else if (enemy.health > robot.health) {
                        robot.health = 0;
                        enemy.health--;
                        stack.push(enemy);
                    } else {
                        robot.health--;
                        enemy.health = 0;
                    }
                }
                break;
            default:
                break
        }
    }
    
    const result = [];
    for (const position of positions) {
        const robot = map.get(position);
        if (robot.health > 0) {
            result.push(robot.health)
        }
    }
    return result;
};