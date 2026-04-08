function xorAfterQueries(nums: number[], queries: number[][]): number {
    const MOD = 1e9 + 7;
    
    // 1. Process each query
    for (let query of queries) {
        let idx = query[0]; // Start index
        
        // 2. Jump through the array using the step size
        while (idx <= query[1]) { // Boundary check
            // Multiply and apply modulo
            nums[idx] = (nums[idx] * query[3]) % MOD;
            
            // Move to the next index by the given step
            idx += query[2];
        }
    }

    // 3. Compute and return the XOR sum of the entire array
    return nums.reduce((acc, curr) => acc ^ curr, 0);
};