class Solution {
    boolean ispossible(int a[],int k,long max){
        long count=0;

        for(int i =0;i<a.length;i++){
            int val = a[i];
            count+=max/val;

        }
        return count>=k;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long l =1;
        int min = time[0];
        for(int i:time){
            if(i<min) min = i;
        }
        long r= 1L * min*totalTrips;

        while(l<=r){
            long mid = l+(r-l)/2;
            if(ispossible(time,totalTrips,mid)) r = mid-1;
            else if(!ispossible(time,totalTrips,mid)) l = mid+1;

            else r = mid-1;


        }
        return l;

        
    }
}