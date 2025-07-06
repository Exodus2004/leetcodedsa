class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int intial = 0;
        for(int i = 0;i<n;i++){

            if(i>intial) return false;

            intial = Math.max(intial,i+nums[i]);

        }


        return true;
        
        
    }
}