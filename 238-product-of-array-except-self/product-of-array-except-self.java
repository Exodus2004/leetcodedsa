class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        int c = 1;
        Arrays.fill(a,1);

       for(int i =0;i<n;i++){
        a[i] *= c;
        c *= nums[i];
       }
        c=1;
       for(int i =n-1;i>=0;i--){
        a[i] *= c;
        c *= nums[i];
       }
        return a;
        
    }
}