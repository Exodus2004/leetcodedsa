class Solution {
    public int[] buildArray(int[] nums) {
        int a[] = new int[nums.length];
        int n = a.length;
        for(int i =0;i<n;i++) a[i] = nums[nums[i]];
        return a;

        
    }
}