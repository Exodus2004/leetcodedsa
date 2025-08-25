class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        int pre [] = new int[n];
        int suf [] = new int[n];
        pre[0] = nums[0];
        suf[n-1]= nums[n-1];
        for(int i = 1;i<n;i++){
            pre[i] = pre[i-1]*nums[i];
        }
        for(int i = n-2;i>=0;i--){
            suf[i] = suf[i+1]*nums[i];

        }
        for(int i =1;i<n-1;i++){
            a[i] = suf[i+1]*pre[i-1];

        }
        a[0] = suf[1];
        a[n-1] = pre[n-2];
        return a;

        
    }
}