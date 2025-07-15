class Solution {
    public int numDistinct(String s, String t) {
        Integer dp[][] = new Integer[s.length()][t.length()];
        return fun(s,0,t,0,dp);
        
    }
    static int fun(String s,int i,String p,int j,Integer dp[][]){
        if(j>=p.length()) return 1;
        if(i>=s.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        

        if(s.charAt(i)==p.charAt(j)){
            int c1 =fun(s,i+1,p,j+1,dp);
            int c2 = fun(s,i+1,p,j,dp);
            return dp[i][j]=c1+c2;

        } 

        
        return dp[i][j]=fun(s,i+1,p,j,dp);
    }
}