class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int mid = 0;
        int high = n-1;


        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,l);
                l++;
                mid++;

            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;


            }
            else{
                mid++;
            }
        }
        
        
    }
    static void swap(int []nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}