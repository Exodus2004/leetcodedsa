const { floor, max, min } = Math;

const waves = (() => {
    const arr = [];
    for (let i = 0; i < 1000; i++) {
        const r = i % 10;
        const m = floor(i / 10) % 10;
        const l = floor(i / 100) % 10;
        if ((m > max(l, r)) | (m < min(l, r)))
            arr.push(i);
    }
    return arr;
})();

const countWays = (num, pattern) => {
    const str = String(num);
    const n = str.length;
    const t = pattern < 100;
    
    let ways = 0;
    let mult = 1;

    for (let i = 0; i <= n - 3; i++) {
        const pre = +str.slice(0, n - 3 - i);
        const cur = +str.slice(n - 3 - i, n - i);
        const suf = +str.slice(n - i);

        let count = 0;
        let edge = 0;

        if (cur > pattern)
            count = pre - t + 1;
        else if (cur === pattern) {
            count = max(0, pre - t);
            edge = (pre >= t) * (suf + 1);
        }
        else if (cur < pattern)
            count = max(0, pre - t);

        ways += count * mult + edge;
        mult *= 10;
    }

    return ways;
};

const waveCount = num => {
    if (num < 100) return 0;

    let res = 0;

    for (const pattern of waves)
        res += countWays(num, pattern);

    return res;
};

const totalWaviness = (A, B) => waveCount(B) - waveCount(A - 1);