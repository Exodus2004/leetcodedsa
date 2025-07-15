class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        Integer dp[][] = new Integer[s.length()][s.length()];
        return fun(0,s,0,sb.reverse().toString(),dp);
        
        
    }
    static int fun(int i,String s,int j,String p,Integer dp[][]){
        if(i>=s.length()||j>=p.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i)==p.charAt(j)) return 1+fun(i+1,s,j+1,p,dp);

        int c1 = fun(i+1,s,j,p,dp);
        int c2 = fun(i,s,j+1,p,dp);
        return dp[i][j] = Math.max(c1,c2);
    }
}