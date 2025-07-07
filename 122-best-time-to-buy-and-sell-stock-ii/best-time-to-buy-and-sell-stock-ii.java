class Solution {
    public int maxProfit(int[] prices) {
        int dp[][] =new int[prices.length][2];
        for(int i[]:dp){
            Arrays.fill(i,-1);

        }
        return fun(prices,0,1,0,prices.length,dp);
        
    }
    static int fun(int a[],int i,int buy,int sell,int n,int dp[][]){
        if(i>=n) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];

        if(buy ==1){
            int nb = fun(a,i+1,1,0,n,dp);
            int b = fun(a,i+1,0,1,n,dp)-a[i];
           return dp[i][buy]=Math.max(nb,b);

        }
        else{
            int nsell =fun(a,i+1,0,1,n,dp);
            int s = a[i]+fun(a,i+1,1,0,n,dp);

           return dp[i][buy]=Math.max(nsell,s); 

        }
    }
}