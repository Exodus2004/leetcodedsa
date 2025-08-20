class Solution {
    boolean ispossible(int a[],int k,int max){
        
        k--;
        int n = a.length;
        int prev = a[0];
        int count = 0;
        for(int i=0;i<n;i++){
            int val = a[i];
            if(val-prev>=max){
                prev = val;
                k--;

            }
            if(k<=0) return true;



        }
        return false;

    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l = 0;
        int r = (int)Math.pow(10,9);

        while(l<=r){
            int mid = l+(r-l)/2;
            if(ispossible(price,k,mid)) l = mid+1;

            else if(!ispossible(price,k,mid)) r= mid-1;

            else l = mid+1;

        }
        return r;

        
    }
}