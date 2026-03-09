function numberOfStableArrays(
  zero: number,
  one: number,
  limit: number
): number {
  const mod = 10 ** 9 + 7;

  // Initialize the memoization array
  const dp: number[][][] = Array.from({ length: zero + 1 }, () =>
    Array.from({ length: one + 1 }, () => Array(2).fill(-1))
  );

  return (recursive(zero, one, 0) + recursive(zero, one, 1)) % mod;

  function recursive(zeros: number, ones: number, last: number): number {
    // Base case
    if (zeros == 0 && ones == 0) return 1;

    // If this state has been computed before, return the stored result
    if (dp[zeros][ones][last] !== -1) {
      return dp[zeros][ones][last];
    }

    let result = 0;
    if (last == 0) {
      for (let k = 1; k <= Math.min(limit,ones); k++) {
        result = (result + recursive(zeros, ones - k, 1)) % mod;
      }
    } else {
      for (let k = 1; k <= Math.min(limit,zeros); k++) {
        if (zeros >= k)
        result = (result + recursive(zeros - k, ones, 0)) % mod;
      }
    }

    // Store the result in the memoization array
    dp[zeros][ones][last] = result;

    return result;
  }
}