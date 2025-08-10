class Solution {
    boolean fun(int a[],int days,int max){
       int value = 0;
       for(int num: a){
        if(num > max) return false;
        if(value+num>max){
            days--;
            value=0;

        }
        value+=num;
        if(days<=0) return false;
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