class Solution {
    public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(funr(nums,nums[i])!=funl(nums,nums[i])) return nums[i];
        }
        return 0;

        
        
    }
    int funr(int a[],int target){
        int l  =0;
        int r = a.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid]==target){
                r = mid-1;

            }
            else if(a[mid]<target) l = mid+1;
            else r = mid-1;

        }
        return l;

    }
    int funl(int a[],int target){
        int l  =0;
        int r = a.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid]==target){
                l = mid+1;

            }
            else if(a[mid]<target) l = mid+1;
            else r = mid-1;

        }
        return r;

    }
    

}