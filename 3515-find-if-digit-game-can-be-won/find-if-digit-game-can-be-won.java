class Solution {
    public boolean canAliceWin(int[] nums) {
        int dsum = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>9) dsum+=nums[i];
            else sum+=nums[i];
        }
        return !(sum==dsum);

        
    }
}