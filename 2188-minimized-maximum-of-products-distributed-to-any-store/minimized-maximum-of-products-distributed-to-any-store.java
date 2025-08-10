class Solution {
    boolean ispossible(int a[],int max,int n){
        int temp =0;
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for(int i:a){
            count+=(i+max-1)/max;

        }
        return count<=n;

        


    }
    public int minimizedMaximum(int n, int[] quantities) {
        
        int l = 1;
        int r = 100000;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(ispossible(quantities,mid,n)) r= mid-1;

            else if(!ispossible(quantities,mid,n)) l = mid+1;
            else r = mid-1;

        }
        return l;

        
    }
}