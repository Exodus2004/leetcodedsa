class Solution {
    public int maxProfit(int[] prices) {
        Integer dp[][][] = new Integer[prices.length][2][2];
        return fun(0,prices,1,prices.length,1,dp);
        
    }
    static int fun(int i,int a[],int buy,int n,int k,Integer dp[][][]){
        if(i>=n) return 0;
        if(k==0) return 0;
        if(dp[i][buy][k]!=null) return dp[i][buy][k];

        if(buy==1){
            int b = fun(i+1,a,0,n,k,dp)-a[i];
            int nb =fun(i+1,a,1,n,k,dp);

            return dp[i][buy][k] = Math.max(b,nb);

        }
        else{
            int s = a[i]+fun(i+1,a,1,n,k-1,dp);
            int ns = fun(i+1,a,0,n,k,dp);
            return dp[i][buy][k] = Math.max(s,ns);

        }
        
    }
}