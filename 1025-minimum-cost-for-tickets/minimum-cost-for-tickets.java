class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Integer dp[] = new Integer[days.length];
        return fun(days,costs,0,days.length,dp);
        
    }
    static int fun(int a[],int b[],int i,int n,Integer dp[]){

        if(i>=n) return 0;
        if(dp[i]!=null) return dp[i];



        int c1=b[0]+fun(a,b,i+1,n,dp);

       int next7 =0;
       while(next7<n && a[next7]<=a[i]+6){
        next7++;
       }
       int c2 = b[1]+fun(a,b,next7,n,dp);

       int next30 = 0;
       while(next30<n && a[next30]<=a[i]+29){
        next30++;
       }
       int c3 = b[2]+fun(a,b,next30,n,dp);


        return dp[i]=Math.min(c1,Math.min(c3,c2));
    }
}