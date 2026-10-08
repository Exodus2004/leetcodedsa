const removeOuterParentheses = s => {
    let res = '', lvl = 0;

    for (const c of s)
        if ((c === '(' && lvl++) || (c === ')' && lvl-- > 1))
            res += c;

    return res;
};