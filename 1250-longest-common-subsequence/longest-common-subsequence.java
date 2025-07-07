class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(0,0,text1,text2,m,n,dp);
        
    }
    static int fun(int i,int j,String p,String s,int m,int n,int dp[][]){
        if(i>=m||j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(p.charAt(i)==s.charAt(j)){
            return 1+fun(i+1,j+1,p,s,m,n,dp);
        }
        int c1= fun(i+1,j,p,s,m,n,dp);
        int c2= fun(i,j+1,p,s,m,n,dp);

        return dp[i][j]=Math.max(c1,c2);
    }
}