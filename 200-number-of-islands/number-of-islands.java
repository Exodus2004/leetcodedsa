class Solution {
    
    
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        
        int count =0;

        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(vis,grid,i,j);
                    count++;

                    

                }
                

            }
        }
        return count;

        
        
    }
    static void dfs(boolean vis[][],char[][]grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        vis[i][j] = true;

        int drow[] = {0,0,-1,+1};
        int dcol[]= {-1,+1,0,0};

        for(int p =0;p<4;p++){
            int nrow = i+drow[p];
            int ncol = j+dcol[p];
            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && grid[nrow][ncol]=='1' && !vis[nrow][ncol]){
                dfs(vis,grid,nrow,ncol);
            }

        }

    }
}