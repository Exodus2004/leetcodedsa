function maxSubarraySumCircular(nums: number[]): number {
    const n = nums.length;
    let total = nums[0];
    let maxSum = nums[0];
    let curMax = nums[0];
    let minSum = nums[0];
    let curMin = nums[0];
    
    for (let i = 1; i < n; i++) {
        const num = nums[i];
        total += num;
        curMax = Math.max(num, curMax + num);
        maxSum = Math.max(maxSum, curMax);
        curMin = Math.min(num, curMin + num);
        minSum = Math.min(minSum, curMin);
    }
    if (maxSum < 0) { return maxSum; }
    return Math.max(maxSum, total - minSum);    
};