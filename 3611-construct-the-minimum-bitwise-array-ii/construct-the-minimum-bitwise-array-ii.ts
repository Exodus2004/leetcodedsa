function minBitwiseArray(nums: number[]): number[] {
  return nums.map((num) => (num === 2 ? -1 : (((-num - 2) ^ num) >> 2) + num))
}