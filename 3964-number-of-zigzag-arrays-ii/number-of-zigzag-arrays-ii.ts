function zigZagArrays(n: number, l: number, r: number): number {
    const MOD = 1000000007n;
    const k = r - l + 1;
    if (k <= 0) return 0;

    // Initialize matrix m
    let m: bigint[][] = Array.from({ length: k }, (_, i) =>
        Array.from({ length: k }, (_, j) => (i + j + 1 < k ? 1n : 0n))
    );

    // Initialize result vector
    let res: bigint[] = Array(k).fill(1n);
    n -= 1;

    function matMul(a: bigint[][], b: bigint[][]): bigint[][] {
        const sz = a.length;
        const c: bigint[][] = Array.from({ length: sz }, () => Array(sz).fill(0n));
        for (let i = 0; i < sz; i++) {
            for (let k = 0; k < sz; k++) {
                if (a[i][k] === 0n) continue;
                for (let j = 0; j < sz; j++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }
        return c;
    }

    function vecMatMul(v: bigint[], mat: bigint[][]): bigint[] {
        const sz = v.length;
        const res: bigint[] = Array(sz).fill(0n);
        for (let j = 0; j < sz; j++) {
            for (let i = 0; i < sz; i++) {
                res[j] = (res[j] + v[i] * mat[i][j]) % MOD;
            }
        }
        return res;
    }

    while (n > 0) {
        if (n & 1) res = vecMatMul(res, m);
        m = matMul(m, m);
        n >>= 1;
    }

    const total = res.reduce((a, b) => (a + b) % MOD, 0n);
    return Number((total * 2n) % MOD);
}