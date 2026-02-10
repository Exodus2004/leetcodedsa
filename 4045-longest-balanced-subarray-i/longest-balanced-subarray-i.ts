const longestBalanced = (nums: number[]): number => {
    let maxLength = 0;
    
    for (let i = 0; i < nums.length; i++) {
        const evens = new Set<number>();
        const odds = new Set<number>();
        
        for (let j = i; j < nums.length; j++) {
            if (nums[j] % 2 === 0) {
                evens.add(nums[j]);
            } else {
                odds.add(nums[j]);
            }
            
            if (evens.size === odds.size) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
    }
    
    return maxLength;
}