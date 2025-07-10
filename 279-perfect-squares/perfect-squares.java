class Solution {
    public int numSquares(int n) {

        List<Integer> l = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            l.add(i*i);
        }
        System.out.println(l);
        Collections.reverse(l);

        Integer dp[][] = new Integer[l.size()][n+1];
        return fun(l,0,n,l.size(),dp);

        
    }
    static int fun(List<Integer> l,int i,int n,int size,Integer dp[][]){
        if(i>=size || n<0) return 1000000;
        if(n==0) return 0;
        if(dp[i][n]!=null) return dp[i][n];
        int c1 = fun(l,i+1,n,size,dp);
        int c2 = 1+fun(l,i,n-l.get(i),size,dp);

        return dp[i][n]=Math.min(c1,c2);
        
       

    }
}