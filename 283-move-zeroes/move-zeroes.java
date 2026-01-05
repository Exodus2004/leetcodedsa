class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while(left<=right &&right<n){
            if(nums[right]!=0){
                nums[left++] = nums[right];
                right++;
            }
            else right++;

        }
        while(left<n) nums[left++] = 0;
        
    }
}