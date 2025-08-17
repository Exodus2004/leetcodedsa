class Solution {
    boolean ispossible(int a[],double hour,int max){
        double total=0;
        int sum = 0;
        for(int i =0;i<a.length;i++){
            int val = a[i];
            double x = (double)val/max;
            if(i!=a.length-1) x=Math.ceil(x);
            total+=x;
            if(hour<total) return false;
        }
        return total<=hour;

        
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        
        int l = 1;
        int r = 10000000;
        int res = -1;

        while(l<=r){
            int mid =l+(r-l)/2; 
            if(ispossible(dist,hour,mid)){
                r = mid-1;
                res = mid;
            }
            else if(!ispossible(dist,hour,mid)) l =mid+1;
            else r = mid-1;

        }
        return res;

    }
}