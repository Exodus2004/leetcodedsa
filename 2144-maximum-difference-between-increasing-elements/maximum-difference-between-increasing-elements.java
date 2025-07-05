class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;

        int min = nums[0];
        int dif = -1;
        

        for(int i =0;i<n;i++){
            min = Math.min(nums[i],min);
            dif = Math.max(dif,nums[i]-min);

        }
        return dif==0?-1:dif;
        
    }
}