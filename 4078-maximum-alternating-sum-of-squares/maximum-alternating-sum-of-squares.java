class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int m = n/2;
        long sum = 0;
                for(int i = 0;i<n;i++) nums[i] = nums[i]*nums[i];

        
        Arrays.sort(nums);
        for(int i = 0;i<m;i++) sum-=nums[i];
        for(int i = m;i<n;i++) sum+=nums[i];
        return sum;

        
    }
}