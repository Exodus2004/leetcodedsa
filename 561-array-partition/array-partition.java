class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int mn= Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        for(int i=1;i<n;i=i+2){
            sum+=Math.min(nums[i-1],nums[i]);


        }
        return sum;
        
    }
}