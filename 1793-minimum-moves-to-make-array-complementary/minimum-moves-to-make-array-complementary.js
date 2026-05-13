var minMoves = function(nums, limit) {

    let n = nums.length;

    let diff = new Array(2 * limit + 2).fill(0);

    for (let i = 0; i < n / 2; i++) {

        let a = nums[i];
        let b = nums[n - 1 - i];

        let low = Math.min(a, b) + 1;
        let high = Math.max(a, b) + limit;

        let sum = a + b;

        // assume 2 moves
        diff[2] += 2;
        diff[2 * limit + 1] -= 2;

        // one move range
        diff[low] -= 1;
        diff[high + 1] += 1;

        // zero move exact sum
        diff[sum] -= 1;
        diff[sum + 1] += 1;
    }

    let ans = Infinity;
    let moves = 0;

    for (let target = 2; target <= 2 * limit; target++) {
        moves += diff[target];
        ans = Math.min(ans, moves);
    }

    return ans;
};