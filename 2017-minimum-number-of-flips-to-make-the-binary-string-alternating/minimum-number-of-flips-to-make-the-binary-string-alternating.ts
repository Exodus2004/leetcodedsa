function minFlips(s: string): number {
  const memo = [
    [0, 0],
    [0, 0],
  ];

  for (let i = 0; i < s.length; i++) {
    memo[s.charAt(i)][i & 1]++;
  }
  let ans = Math.min(memo[0][0] + memo[1][1], memo[0][1] + memo[1][0]);
  const isEvenLength = (s.length & 1) === 0;
  for (let i = 0; i < s.length; i++) {
    swap(memo[0], 0, 1);
    swap(memo[1], 0, 1);

    if (!isEvenLength) {
      memo[s.charAt(i)][1]--;
      memo[s.charAt(i)][0]++;
    }
    ans = Math.min(
      ans,
      Math.min(memo[0][0] + memo[1][1], memo[0][1] + memo[1][0])
    );
  }
  return ans;
}

function swap(arr: number[], i: number, j: number) {
  const tmp = arr[i];
  arr[i] = arr[j];
  arr[j] = tmp;
}