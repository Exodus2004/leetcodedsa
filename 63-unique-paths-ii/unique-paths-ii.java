class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        Integer dp[][] = new Integer[obstacleGrid.length][obstacleGrid[0].length];
        return fun(obstacleGrid,0,0,dp);

        
    }
    static int fun(int [][] a,int i,int j,Integer dp[][]){
        if(i>=a.length || j>=a[0].length) return 0;
        if(a[i][j]==1) return 0;
        if(i==a.length-1 && j==a[0].length-1) return 1;
        if(dp[i][j]!=null) return dp[i][j];

        

        return dp[i][j]=fun(a,i+1,j,dp)+fun(a,i,j+1,dp);
    }
}