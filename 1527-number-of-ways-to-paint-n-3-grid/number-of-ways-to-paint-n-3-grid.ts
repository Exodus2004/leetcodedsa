const m = 1e9 + 7;
const numOfWays = (n) => {
    let diff = 6;
    let same = 6;
    for (let i = 1; i < n; ++i) {
        let newDiff = (2 * diff + 2 * same) % m;
        let newSame = (2 * diff + 3 * same) % m;
        same = newSame;
        diff = newDiff;
    }
    return (same + diff) % m;
};