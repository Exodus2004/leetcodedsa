function longestConsecutive(nums: number[]): number {
    const set = new Set(nums);
    let maxLen = 0;

    for (const num of set) {
        // Only start counting if 'num' is the start of a sequence
        if (!set.has(num - 1)) {
            let currentNum = num;
            let currentLen = 1;

            while (set.has(currentNum + 1)) {
                currentNum += 1;
                currentLen += 1;
            }

            maxLen = Math.max(maxLen, currentLen);
        }
    }

    return maxLen;
}