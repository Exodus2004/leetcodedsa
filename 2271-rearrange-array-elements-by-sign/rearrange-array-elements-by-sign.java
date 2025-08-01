class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[] = new int[nums.length];
        int p =0;
        int n = 1;
        for(int i =0;i<nums.length;i++){
            if( nums[i]>0){
                a[p] = nums[i];
                p+=2;
            }
            else{
                a[n] = nums[i];
                n+=2;
            }
        }
        return a;
        
    }
}