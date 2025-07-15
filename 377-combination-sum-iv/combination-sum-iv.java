class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer dp[][] = new Integer[nums.length][target+1];
        return fun(nums,0,target,dp);
        
    }
    static int fun(int a[],int i,int k,Integer dp[][]){
        if(i>=a.length || k<=0) return (k==0)?1:0;
        if(dp[i][k]!=null) return dp[i][k];

        
        int c1 = fun(a,i+1,k,dp);
        int c2=fun(a,0,k-a[i],dp);

        return dp[i][k]=c1+c2;





    }
}