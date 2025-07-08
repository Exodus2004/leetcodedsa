class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) sum +=nums[i];



        if(sum%2!=0) return false;

        Integer dp[][] = new Integer[nums.length][(sum/2)+1];

        return fun(nums,0,sum/2,nums.length,dp);


        
    }
    static boolean fun(int a[],int i,int half,int n,Integer dp[][]){
        if(half==0) return true;
       

        if(i>=n || half<0) return false;
        if(dp[i][half]!=null) return dp[i][half] == 1;


        boolean c1 = fun(a,i+1,half,n,dp);
        boolean c2 = fun(a,i+1,half-a[i],n,dp);

        if(c1||c2) dp[i][half] = 1;

        else dp[i][half] = 0;

        return c1||c2;
    }
}