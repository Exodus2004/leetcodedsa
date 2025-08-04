class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int l =0;
        int r = 0;
        int sum = 0;
        

        while(r<nums.length){
            sum+=nums[r];
            System.out.println(sum);
            


            while(sum>=target){
                if(sum>=target) min = Math.min(min,r-l+1);

                sum-=nums[l];
                l++;

            }
            r++;

        }
        return min==Integer.MAX_VALUE?0:min;
        
    }
}