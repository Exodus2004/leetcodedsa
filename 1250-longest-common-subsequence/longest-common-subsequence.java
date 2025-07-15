class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] = new Integer[text1.length()][text2.length()];
        return fun(0,text1,0,text2,dp);
        
    }
    static int fun(int i,String s,int j,String p,Integer dp[][]){
        if(i>=s.length() || j>=p.length()) return 0;
        if(dp[i][j]!=null ) return dp[i][j];

        if(s.charAt(i)==p.charAt(j)) return 1+fun(i+1,s,j+1,p,dp);

        int c1 = fun(i+1,s,j,p,dp);
        int c2 = fun(i,s,j+1,p,dp);

    return dp[i][j] =Math.max(c1,c2);
    }
}