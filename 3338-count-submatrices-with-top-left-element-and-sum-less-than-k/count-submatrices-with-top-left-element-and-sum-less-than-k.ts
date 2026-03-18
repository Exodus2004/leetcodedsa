const cols = new Int32Array(1000);

function countSubmatrices(grid: number[][], k: number): number {
  const n = grid[0].length;
  let ans = 0;

  cols.fill(0, 0, n);

  for (const row of grid) {
    let sum = 0;
    for (let j = 0; j < n; ++j) {
      cols[j] += row[j];
      sum += cols[j];
      if (sum > k) break;
      ++ans;
    }
  }
  return ans;
}