class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = 1;
        for(int i =0;i<n;i++){
            if(nums[i]==min) min++;
        }
        return min;
    }
}