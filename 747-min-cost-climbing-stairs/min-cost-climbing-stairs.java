class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer dp[] = new Integer[cost.length+1];
        return Math.min(fun(cost,0,cost.length,dp),fun(cost,1,cost.length,dp));
        
    }
    static int fun(int a[],int i,int n,Integer dp[]){
        if(i>=n) return 0;
        if( dp[i]!=null) return dp[i];

        int c1 = a[i]+fun(a,i+1,n,dp);
        int c2 = a[i] +fun(a,i+2,n,dp);

        return dp[i]=Math.min(c1,c2);
    }
}