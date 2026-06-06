/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRightDifference = function(nums) {
    const n = nums.length;
    const leftSum = new Array(n).fill(0);
    const rightSum = new Array(n).fill(0);
    const newSum = new Array(n);

    for (let i = 1; i < n; i++) {
        leftSum[i] = leftSum[i - 1] + nums[i - 1];
    }

    for (let j = n - 2; j >= 0; j--) {
        rightSum[j] = rightSum[j + 1] + nums[j + 1];
    }

    for (let k = 0; k < n; k++) {
        newSum[k] = Math.abs(leftSum[k] - rightSum[k]);
    }

    return newSum;
};