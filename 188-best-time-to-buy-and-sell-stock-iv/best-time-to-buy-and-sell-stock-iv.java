class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[][][] = new int[prices.length][2][k+1];

        for(int i =0;i<prices.length;i++){
            for(int j = 0;j<2;j++){
                for(int z = 0;z<k+1;z++) dp[i][j][z] = -1;
            }
        }
        return fun(prices,0,1,prices.length,k,dp);
        
    }
    static int fun(int []a,int i,int buy,int n,int k,int dp[][][]){
        if(k==0) return 0;

        if(i>=n) return 0;
        if(dp[i][buy][k]!=-1) return dp[i][buy][k];

        if(buy==1){
            int b = fun(a,i+1,1,n,k,dp);
            int nb = fun(a,i+1,0,n,k,dp)-a[i];
            return dp[i][buy][k]=Math.max(b,nb);
        }
        else{
            int s = fun(a,i+1,0,n,k,dp);
            int ns = a[i]+fun(a,i+1,1,n,k-1,dp);
            return dp[i][buy][k]=Math.max(s,ns);
        }
    }
}