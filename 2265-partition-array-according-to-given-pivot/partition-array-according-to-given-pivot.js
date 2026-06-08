var pivotArray = function(nums, pivot) {
    const ans = [];

    for (const num of nums) {
        if (num < pivot) {
            ans.push(num);
        }
    }

    for (const num of nums) {
        if (num === pivot) {
            ans.push(num);
        }
    }

    for (const num of nums) {
        if (num > pivot) {
            ans.push(num);
        }
    }

    return ans;
};