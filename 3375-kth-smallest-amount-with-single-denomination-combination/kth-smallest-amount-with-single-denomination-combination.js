function findKthSmallest(coins, k) {
    const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
    const lcm = (a, b) => {
        return (a * b) / gcd(a, b);
    };

    const n = coins.length;
    let left = 1;
    let right = Math.min(...coins) * k;
    let ans = right;
    const count = (x) => {
        let total = 0;
        for (let mask = 1; mask < (1 << n); mask++) {
            let curLcm = 1;
            let countBits = 0;

            for (let i = 0; i < n; i++) {
                if ((mask & (1 << i)) !== 0) {
                    countBits++;
                    curLcm = lcm(curLcm, coins[i]);
                    if (curLcm > x) break;
                }
            }

            if (curLcm <= x) {
                if (countBits % 2 === 1) {
                    total += Math.floor(x / curLcm);
                } else {
                    total -= Math.floor(x / curLcm);
                }
            }
        }
        return total;
    };
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (count(mid) >= k) {
            ans = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return ans;
}