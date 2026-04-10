const minimumDistance = nums => {
    const len = nums.length;
    const last2 = Array(len).fill(0);
    let res = 300;

    for (let i = 0; i < len; i++) {
        const val = nums[i] - 1;
        const pos = i + 1, pack = last2[val];
        const old = pack & 255, cur = pack >> 8;

        last2[val] = cur | (pos << 8);

        if (old)
            res = Math.min(res, (pos - old) << 1);
    }

    return -(res === 300) | res;
};