class Solution {
  func maximumAmount(_ coins: [[Int]]) -> Int {
    coins.indices.reduce([[Int]]()) {prevDp,i in
      coins[0].indices.reduce(into: [[Int]]()) { dp,j in
        dp.append(
         i+j==0 
         ? [coins[0][0], coins[0][0] < 0 ? 0 : .min, .min] 
         : (0...2).reduce(into: [Int.min,.min,.min]) {[c=coins[i][j]] m, k in
            let b = max(i > 0 ? prevDp[j][k] : .min, j > 0 ? dp[dp.count-1][k] : .min)
            guard b > .min else { return }
            m[k] = max(m[k], b + c)
            if c<0, k<2 { m[k+1] = max(m[k+1], b) }
          }
        )
      }
    }.last!.max()!
  }
}