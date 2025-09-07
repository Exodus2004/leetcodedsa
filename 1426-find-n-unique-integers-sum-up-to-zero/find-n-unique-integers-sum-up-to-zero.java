class Solution {
    public int[] sumZero(int n) {
        int a[ ] = new int[n];
        int l =0;
        int r = n-1;
        int val = n/2;
        while(l<r){
            a[l] = -1*val;
            a[r] = val;
            l++;
            r--;
            val--;
            
        }
        return a;
        
    }
}