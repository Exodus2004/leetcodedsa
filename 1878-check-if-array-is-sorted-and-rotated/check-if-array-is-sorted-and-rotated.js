const check = nums => {
    let fault = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums.at(i - 1) > nums[i]) {
            if (fault) return 0;
            fault = 1;
        }
    }

    return 1;
};