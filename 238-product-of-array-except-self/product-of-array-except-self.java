class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int lp[] = new int[n];
        int rp[] = new int[n];
        lp[0] = nums[0];
        for(int i =1;i<n;i++) lp[i] = lp[i-1]*nums[i];
        rp[n-1] = nums[n-1];
        for(int i =n-2;i>=0;i--) rp[i] = rp[i+1]*nums[i];
        int a[] = new int[n];

        for(int i=1;i<n-1;i++){
            a[i] = lp[i-1]*rp[i+1];


        }
        a[0] =rp[1];
        a[n-1] = lp[n-2];
        return a;
        
    }
}