class Solution {
    boolean ispossible(int a[],int max,int m){
        int prev = a[0];
        m--;
        for(int i =0;i<a.length;i++){
            int val = a[i];

            if(val-prev>=max){
                m--;
                prev = val;
            }
            

            

        }
        return m<=0;


    
        
        

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = (int)Math.pow(10,9);
           
        

        while(l<=r){
            int mid = l+(r-l)/2;

            if(ispossible(position,mid,m)) l = mid+1;

            else if(!ispossible(position,mid,m)) r = mid-1;
            else l = mid+1;

        }
        return r;
        
    }
}