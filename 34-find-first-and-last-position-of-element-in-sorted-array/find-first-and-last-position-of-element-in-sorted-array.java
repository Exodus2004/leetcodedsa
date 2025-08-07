class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a[] = new int[2];
        if(nums.length==0) return new int[]{-1,-1};

        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int m =(l+r)/2;
            if(nums[m]==target){
                r = m-1;
            }
            else if(nums[m]>target) r = m-1;
            else l = m+1;
        }
        if(l<0 || l>=nums.length || nums[l]!=target) a[0] = -1;
        else a[0] = l;


        l = 0;
         r = nums.length-1;
        while(l<=r){
            int m =(l+r)/2;
            if(nums[m]==target){
                l = m+1;
            }
            else if(nums[m]>target) r = m-1;
            else l = m+1;
        }
        if(r<0 || r>=nums.length || nums[r]!=target) a[1] = -1;
        else a[1] = r;

        return a;

        
    }

}