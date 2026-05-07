function maxValue(a) {
    const n = a.length;
    const pre = new Array(n);
    const suff = new Array(n);
    const res = new Array(n);

    pre[0] = a[0];
    suff[n - 1] = a[n - 1];

    for (let i = 1; i < n; i++) {
        pre[i] = Math.max(a[i], pre[i - 1]);
    }

    for (let i = n - 2; i >= 0; i--) {
        suff[i] = Math.min(a[i], suff[i + 1]);
    }

    res[n - 1] = pre[n - 1];

    for (let i = n - 2; i >= 0; i--) {
        res[i] = pre[i];

        if (pre[i] > suff[i + 1]) {
            res[i] = res[i + 1];
        }
    }

    return res;
}