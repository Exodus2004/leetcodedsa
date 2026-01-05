class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = 0;
        while(right<n){
            if(nums[left]==nums[right]){
                right++;
            }
            else{
                left++;
                nums[left] = nums[right++];
            }
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
        
    }
}