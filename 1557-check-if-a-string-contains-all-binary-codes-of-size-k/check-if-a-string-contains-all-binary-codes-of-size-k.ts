const seen = new Int8Array(1 << 20);

function hasAllCodes(s: string, k: number): boolean {
  let cnt = 1 << k;
  const mask = cnt - 1;
  
  seen.fill(0, 0, cnt);

  let code = parseInt(s.slice(0, k - 1), 2);

  for (let i = k - 1; i < s.length; ++i) {
    code = (code << 1 | (s.charCodeAt(i) - 48)) & mask;
    cnt -= seen[code] ^ 1; // If-free
    if (cnt === 0) return true;
    seen[code] = 1;
  }

  return false;
}