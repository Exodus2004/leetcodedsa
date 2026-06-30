const numberOfSubstrings = s => {
    let res = 0;
    const p = [-1, -1, -1];

    for (let i = 0; i < s.length; i++) {
        p[(s.charCodeAt(i) & 31) - 1] = i;
        res += Math.min(p[0], p[1], p[2]) + 1;
    }

    return res;
};