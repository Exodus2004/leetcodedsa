class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        int r = 0;
        int count = 0;
        int pro = 1;
        if(k<=1) return 0;

        while(r<n){
            pro *=nums[r];

            while(pro>=k){
                pro/=nums[l];
                l++;
            } 
            count+=r-l+1;
            r++;


        }
        return count;
        
    }
}