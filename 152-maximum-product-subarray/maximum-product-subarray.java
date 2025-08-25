class Solution {
    public int maxProduct(int[] nums) {
        int lp = 1;
        int rp = 1;
        int max = nums[0];

        for(int i = 0;i<=nums.length-1;i++){
            lp = (lp == 0) ? 1 : lp;
            lp*=nums[i];
            
            rp = (rp == 0) ? 1 : rp;
            rp*=nums[nums.length-1-i];
           
            
            
            
            max = Math.max(max,Math.max(lp,rp));

        }
        return max;
        
    }
}