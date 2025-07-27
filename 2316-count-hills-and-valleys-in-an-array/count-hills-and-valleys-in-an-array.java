class Solution {
    public int countHillValley(int[] nums) {
        int p = nums[0];
        int count=0;
        for(int i =1;i<nums.length-1;i++){
            if( (p<nums[i] && nums[i]>nums[i+1]) || (p>nums[i] && nums[i]<nums[i+1])){
                count++;
                            p = nums[i];


            }

        }
        return count;
        
    }
}