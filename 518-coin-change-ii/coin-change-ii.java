class Solution {
    public int change(int amount, int[] coins) {
        int k = amount;
        Integer dp[][] = new Integer[coins.length+1][k+1];
        return fun(coins,0,coins.length,k,dp);

        
    }
    static int fun(int a[],int i,int n,int k,Integer dp[][]){
        if(k==0) return 1;
        if(i>=n || k<0) return 0;
        if(dp[i][k]!=null) return dp[i][k];

        int x = fun(a,i,n,k-a[i],dp);
        int y = fun(a,i+1,n,k,dp);

        return dp[i][k]= x+y;
        
    }
}
