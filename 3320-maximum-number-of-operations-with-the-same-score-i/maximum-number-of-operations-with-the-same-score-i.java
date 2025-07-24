class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        int val = nums[0]+nums[1];
        int count=1;
        for(int i =2;i<n-1;i+=2){
          if(nums[i]+nums[i+1]==val) count++;
          else break;

        }
        return count;
        
    }
}