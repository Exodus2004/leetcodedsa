class Solution {
    public int tribonacci(int n) {
        Integer dp[] =new Integer[n+1];

        return fun(n,dp);
        
    }
    static int fun(int n,Integer dp[]){
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        if(dp[n]!=null) return dp[n];

        return dp[n]=fun(n-2,dp)+fun(n-3,dp)+fun(n-1,dp);
    }
}