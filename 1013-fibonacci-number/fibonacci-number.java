class Solution {
    public int fib(int n) {
        Integer dp[] = new Integer[n+1];
         return fun(n,dp);

        
    
        
    }
    static int fun(int n,Integer dp[]){
        if(n==0 ||n==1) return n;
        if(dp[n]!=null) return dp[n];

        return dp[n]= fun(n-1,dp)+fun(n-2,dp); 
    }
}