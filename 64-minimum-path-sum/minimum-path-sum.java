class Solution {
    public int minPathSum(int[][] grid) {
        Integer dp[][] = new Integer[grid.length][grid[0].length];
        return fun(grid,0,0,grid.length,grid[0].length,dp);
        
    }
    static int fun(int a[][],int i,int j,int m,int n,Integer dp[][]){

        

        if(i>=m || j>=n || i<0 || j<0) return 1000000;
        if(i==m-1 && j==n-1) return a[i][j];
        if(dp[i][j]!=null) return dp[i][j];

        int c1 = a[i][j]+fun(a,i+1,j,m,n,dp);
        int c2 = a[i][j]+fun(a,i,j+1,m,n,dp);
        
        

        return dp[i][j]=Math.min(c1,c2);
        
        
    }
}