class Solution {
    boolean fun(int a[],int days,int max){
        int temp = 0;
        
        
       for(int i = 0;i<a.length;i++){
        int sum  =a[i];
        if(sum>max) return false;
       
        if(sum+temp>max){
            days--;
            temp  = 0;
        }
        temp+=sum;
        if(days==0) return false;

        

        
       }
        
        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 25 * (int)Math.pow(10,6);
       

        while(l<=r){
            int mid = l+(r-l)/2;
            if(fun(weights,days,mid)) r = mid-1;
            else if(!fun(weights,days,mid)) l = mid+1;
            else r =mid-1;
            
        }
        return l;

        
        
    }
}