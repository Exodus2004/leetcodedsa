class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p =0;
        int neg =1;
        int n = nums.length;
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i]>0){
                a[p] = nums[i];
                p+=2;
            }
            else{
                a[neg] = nums[i];
                neg+=2;
            }
        }
        return a;
    }
}