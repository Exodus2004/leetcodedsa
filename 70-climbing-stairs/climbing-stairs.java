class Solution {
    public int climbStairs(int n) {
        int a[] = new int[51];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<51;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n+1];
    }
}