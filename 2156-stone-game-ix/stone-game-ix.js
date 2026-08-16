function stoneGameIX(stones) {
    let y = Array(3).fill(0);

    for (let x of stones) y[x % 3]++;

    y[0] %= 2;

    if (y[0] == 0) {
        if (y[1] == 0 || y[2] == 0) return false;
        return true;
    }

    return Math.abs(y[1] - y[2]) <= 2 ? false : true;
}