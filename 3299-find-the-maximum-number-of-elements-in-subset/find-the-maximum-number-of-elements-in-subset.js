const { floor, max, min, sqrt } = Math;

const maximumLength = A => {
    const freq = new Map();
    for (const c of A) freq.set(c, (freq.get(c) ?? 0) + 1);

    let res = ((freq.get(1) ?? 0) - 1) | 1;
    freq.delete(1);

    for (let [k, _] of freq) {
        const sq = floor(sqrt(k));
        if (sq * sq === k && (freq.get(sq) ?? 0) > 1) continue;

        let x = 0;
        while ((freq.get(k) ?? 0) > 1) {
            x += 2;
            k *= k;
        }

        res = max(res, x + ((freq.has(k) << 1) - 1));
    }

    return res;
};