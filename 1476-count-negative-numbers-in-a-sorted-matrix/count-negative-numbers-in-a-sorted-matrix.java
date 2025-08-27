class Solution {
    public int countNegatives(int[][] grid) {
       int count = 0;
       for(int i[]:grid){
        count+=binary(i);
       }
       return count;

        
    }
    int binary(int a[]){
        int l =0;
        int r = a.length-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid]==0){
                l =mid+1;

            }
            else if(a[mid]>0) l=mid+1;
            else r = mid-1;
        }
        if(r==-1) return a.length;
        if(r==a.length-1) return 0;
        return a.length-1-r;
    }
}