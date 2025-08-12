class Solution {
    boolean ispossible(int a[],long k,int max){
        int temp = 0;
        int sum =0;
        for(int i =0;i<a.length;i++){
            int val = a[i]/max;
            

            k-=val;
            if(k<=0) return true;

           
            
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int l =1;
        int r = (int)Math.pow(10,7);
        
         
        

        while(l<=r){
            int mid = l+(r-l)/2;

            if(ispossible(candies,k,mid)) l = mid+1;

            else if(!ispossible(candies,k,mid)) r = mid-1;

            else l = mid+1;
        }
        return r==-1?0:r;

        
    }
}