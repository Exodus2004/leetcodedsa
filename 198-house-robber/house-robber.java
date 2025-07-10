class Solution {
    public int rob(int[] nums) {
        Integer dp[] = new Integer[nums.length];
        return fun(nums,0,nums.length,dp);
        
    }
    static int fun(int a[],int i,int n,Integer dp[]){
        if( i>=n) return 0;
        if(dp[i]!=null) return dp[i];

        int c = a[i]+fun(a,i+2,n,dp);
        int b = fun(a,i+1,n,dp);

        return dp[i]=Math.max(c,b);
    }
}