class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(n==1) return 0;

        Arrays.sort(nums);
        int l =0;
        int r = k-1;
        int mn= Integer.MAX_VALUE;

        while(r<n){
            mn= Math.min(nums[r]-nums[l],mn);
            r++;
            l++;
        }
        return mn;
        
    }
}