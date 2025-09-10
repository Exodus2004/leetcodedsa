class Solution {
    public int maxProduct(int[] nums) {
        int lp = 1;
        int rp = 1;
        
        int max =0;
        
        int n = nums.length-1;
        if(n==0) return nums[0];
        for(int i=0;i<=n;i++){
            lp*=nums[i];
            rp*=nums[n-i];
            max = Math.max(max,Math.max(rp,lp));
            if(lp==0) lp = 1;
            if(rp==0) rp= 1;
        }
        return max;
        
    }
}