const constructTransformedArray = (nums: number[]) =>
    nums.map((n, i) => nums.at((n + i) % nums.length)!);