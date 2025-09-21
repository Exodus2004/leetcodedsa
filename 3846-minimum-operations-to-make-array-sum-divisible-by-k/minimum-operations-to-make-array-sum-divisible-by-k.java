class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i :nums) count+=i;
        return count%k;
        
    }
}