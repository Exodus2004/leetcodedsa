class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int val = Integer.MAX_VALUE;

        while(r<n){
            sum = sum+nums[r];
            while(sum>=target){
                val = Math.min(val,r-l+1);
                
                sum -=nums[l];
                l++;

            }
            
            


            r++;
        }
        return val==Integer.MAX_VALUE?0:val;
        
    }
}