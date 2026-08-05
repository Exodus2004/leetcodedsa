var remainingMethods = function(n, k, invocations) {
    const a = Array.from({ length: n }, () => []);

    for (const [x, y] of invocations) {
        a[x].push(y);
    }

    const c = new Array(n).fill(false);
    const d = [k];
    c[k] = true;

    while (d.length) {
        const e = d.shift();
        for (const f of a[e]) {
            if (!c[f]) {
                c[f] = true;
                d.push(f);
            }
        }
    }

    for (const [x, y] of invocations) {
        if (!c[x] && c[y]) {
            return Array.from({ length: n }, (_, i) => i);
        }
    }

    const h = [];
    for (let i = 0; i < n; i++) {
        if (!c[i]) h.push(i);
    }

    return h;
};