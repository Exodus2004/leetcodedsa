function minimumPairRemoval(nums: number[]): number {
    let iterations = 0;
    let n = nums.slice();
    while (n.length > 1) {
        let minSum = Number.MAX_SAFE_INTEGER;
        let minSumPosition = 0;
        let isNonDecreasing = true;
        for (let i = 0; i < n.length-1; i++) {
            if (n[i] > n[i+1]) isNonDecreasing = false;
            const sum = n[i] + n[i+1];
            if (sum < minSum) {
                minSum = sum;
                minSumPosition = i;
            }
        }
        if (isNonDecreasing) break;
        iterations++;
        n[minSumPosition] = n.splice(minSumPosition, 1)[0] + n[minSumPosition];
    }
    return iterations;
};