class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r = piles[0];
        for(int i:piles){
            if(r< i) r = i;
        }

        while(l<=r){
            int m = l+(r-l)/2;
            if(fun(piles,h,m)){
                r = m-1;

            }
            else if(!fun(piles,h,m)) l = m+1;
            else r = m-1;
        }

        return l;
        
    }
    boolean fun(int a[],int h,int k){
        int count = 0;
        int sum =0;
        for(int i=0;i<a.length;i++){
            int val = a[i]/k;
            if(a[i]%k!=0) val++;

            h-=val;
            if(h<0) return false;

            
        }
        return true;
       
    }
}