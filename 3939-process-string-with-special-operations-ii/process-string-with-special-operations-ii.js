const processStr = (s, k) => {
    const n = s.length;
    const lens = [];
    let len = 0;

    for (const c of s) {
        if (c === '*')
            len = Math.max(len - 1, 0);
        else if (c === '#')
            len *= 2;
        else if (c !== '%')
            len++;
        
        lens.push(len);
    }

    if (k >= len) return '.';

    for (let i = n - 1; ; i--) {
        switch (s[i]) {
            case '*':
                break;
            case '#':
                if (k >= Math.floor(lens[i] / 2))
                    k -= Math.floor(lens[i] / 2);
                break;
            case '%':
                k = lens[i] - 1 - k;
                break;
            default:
                if (lens[i] === k + 1)
                    return s[i];
        }
    }
};