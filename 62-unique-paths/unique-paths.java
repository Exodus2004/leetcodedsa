class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int r[]:dp) Arrays.fill(r,-1);
       return fun(0,0,m,n,dp);



       
        
        
    }
    static int fun(int i,int j,int m,int n,int [][]dp){
        if(i==m-1||j==n-1) return 1;
        if(i>m||j>n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=fun(i,j+1,m,n,dp) +fun(i+1,j,m,n,dp);
    }
}