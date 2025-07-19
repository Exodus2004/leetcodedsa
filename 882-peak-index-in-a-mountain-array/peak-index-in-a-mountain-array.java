class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;

        int l = 0;
        int r = n-1;
        int max = Integer.MIN_VALUE;
        while(l<r){
            int m = (l+r)/2;
            System.out.println(m);

           if(arr[m]<arr[m+1]) l = m+1;
           else r = m;
        }
        return r;
        
    }
}