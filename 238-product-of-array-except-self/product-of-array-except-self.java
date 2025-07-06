class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int a[] = new int[n];
        int b[] = new int[n];
        a[0] = nums[0];
        b[n-1] = nums[n-1];
        for(int i=1;i<n;i++) a[i] = a[i-1]*nums[i];
        for(int i=n-2;i>=0;i--) b[i] = b[i+1]*nums[i];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int ans[] = new int[n];
        ans[0] = b[1];
        ans[n-1] = a[n-2];

        
        for(int i =1;i<n-1;i++){
            ans[i] = a[i-1]*b[i+1];
        }
        return ans;
    }
}