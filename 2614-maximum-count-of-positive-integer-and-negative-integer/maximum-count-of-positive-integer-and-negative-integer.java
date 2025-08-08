class Solution {
    public int maximumCount(int[] nums) {
        int leftmost = 0;
        int rightmost = 0;

        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;

            if(nums[m]==0){
                r = m-1;

            }
            else if(nums[m]< 0) l = m+1;

            else r = m-1;


        }
        
        
        int firstval = l;

        l = 0;
        r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;

            if(nums[m]==0){
                l = m+1;

            }
            else if(nums[m]< 0) l = m+1;

            else r = m-1;


        }
        int secondval = r;
       
        
        int countNeg = firstval;
        int countPos = nums.length - secondval - 1;
        
        return Math.max(countNeg, countPos);
        


       
        

    }
}