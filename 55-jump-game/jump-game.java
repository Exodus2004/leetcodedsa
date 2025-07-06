class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        return fun(nums,n,0,dp);
        

    }
    static boolean fun(int a[],int n,int i,int dp[]){
        if(i>=n-1) return true;
        if(dp[i]!=-1) return dp[i]==1;

        if(a[i]==0){
            dp[i] = 0;
            return false;
        }

        for(int j =1;j<=a[i];j++){
            if(fun(a,n,j+i,dp)){
                dp[j] = 1;

                return true;
            }
        }

        dp[i] = 0;
        return false;
    }
}