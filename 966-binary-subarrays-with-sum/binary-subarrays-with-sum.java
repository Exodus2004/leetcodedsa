class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return fun(nums,goal)-fun(nums,goal-1);
        
        
    }
    int fun(int nums[],int goal){
        int l = 0;
        int r  =0;
        int n = nums.length;
        int sum = 0;
        int res = 0;
        int count = 0;

        while(r<n){
            sum = sum+nums[r]; 
            
            while(sum>goal && l<=r){
                sum=sum-nums[l];

                l++;
                

            }
            res +=r-l+1;
        r++;
        }
        return res;
    }
}