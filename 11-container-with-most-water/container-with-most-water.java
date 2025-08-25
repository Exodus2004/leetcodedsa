class Solution {
    public int maxArea(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int max = 0;
        while(l<r){
            int val = Math.min(nums[l],nums[r]) * (r-l);
            max = Math.max(max,val);
            if(nums[l]<nums[r])l++;
            else r--;
            

            

        }
        return max;

        
    }
}