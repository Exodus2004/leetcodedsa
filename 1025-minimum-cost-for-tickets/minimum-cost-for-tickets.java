class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Integer dp[] = new Integer[days.length];
        return fun(days,costs,0,dp);
        
    }
    static int fun(int a[],int c[],int i,Integer dp[]){
        if(i>=a.length) return 0;
        if(dp[i]!=null) return dp[i];

        int c1 = c[0]+fun(a,c,i+1,dp);

        int next7 = i+1;
        while(next7<a.length && a[next7]<=a[i]+6) next7++;

        int c2 = c[1] +fun(a,c,next7,dp);
        int next30 =i+1;
        while(next30<a.length && a[next30]<=a[i]+29) next30++;

        int c3 = c[2]+fun(a,c,next30,dp);

        return dp[i] = Math.min(c1,Math.min(c2,c3));
            
        
    }
}