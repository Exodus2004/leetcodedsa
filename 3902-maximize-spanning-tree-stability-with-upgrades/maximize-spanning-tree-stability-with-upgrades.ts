function find(i: number, ds: number[]): number {
    return ds[i] < 0 ? i : ds[i] = find(ds[i], ds);
}

function maxStability(n: number, edges: number[][], k: number): number {
    const s_u_v: [number, number, number][] = [];
    const ds: number[] = Array(n).fill(-1);
    let used_e = 0, res = 200000, min_single = 200000, min_double = 100000;
    for (const e of edges) {
        if (e[3]) {
            const a = find(e[0], ds), b = find(e[1], ds);
            if (a === b)
                return -1;
            else {
                ++used_e;
                ds[b] = a;
                res = Math.min(res, e[2]);                    
            }
        }
        else
            s_u_v.push([e[2], e[1], e[0]]);
    }
    s_u_v.sort((a, b) => b[0] - a[0]);
    for (const [s, u, v] of s_u_v) {
        const a = find(u, ds), b = find(v, ds);
        if (a !== b) {
            ds[b] = a;
            if (++used_e === n - 1 - k)
                min_single = s;
            min_double = s;
        }
    }
    return used_e === n - 1 ? Math.min(res, min_single, min_double * (k ? 2 : 1)) : -1;
}