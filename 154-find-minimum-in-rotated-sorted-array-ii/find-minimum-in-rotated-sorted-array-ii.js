const findMin = nums => {
    const dnc = (l, r) => {
        if (l === r)
            return nums[l];

        if (nums[l] < nums[r])
            return nums[l];

        const m = (l + r) >> 1;

        return Math.min(
            dnc(l, m),
            dnc(m + 1, r)
        );
    };

    return dnc(0, nums.length - 1);
};