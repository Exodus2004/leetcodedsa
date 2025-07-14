class Solution {
    public int numSquares(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i =1;i*i<=n;i++) l.add(i*i);
        System.out.println(l);
        Integer dp[][]= new Integer[n+1][l.size()];

        return fun(n,l,l.size()-1,dp);
       

        
    }
    static int fun(int n,List<Integer> l,int i,Integer dp[][]){
    if(i<0|| n<0) return 10000007;
   

    if(n==0) return 0;
     if(dp[n][i]!=null) return dp[n][i];

    int c1 = 1+fun(n-l.get(i),l,i,dp);
    int c2 = fun(n,l,i-1,dp);

    return dp[n][i] =Math.min(c1,c2);
    }
}