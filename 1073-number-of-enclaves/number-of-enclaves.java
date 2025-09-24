class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if (grid[0][i] == 1) {
                vis[0][i] = true;
                q.add(new int[]{0, i});
            }
            if (grid[n - 1][i] == 1) {
                vis[n - 1][i] = true;
                q.add(new int[]{n - 1, i});
            }
        }
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                vis[i][0] = true;
                q.add(new int[]{i, 0});
            }
            if (grid[i][m - 1] == 1) {
                vis[i][m - 1] = true;
                q.add(new int[]{i, m - 1});
            }
        }
        int nc[] ={0,0,-1,1};
        int nr[] = {-1,1,0,0};
        while(!q.isEmpty()){
            int val[] = q.poll();
            int x  =val[0];
            int y = val[1];
            for(int i=0;i<4;i++){
                int nx = x+nr[i];
                int ny = y+nc[i];
                if(nx<n && ny<m && nx>=0 && ny>=0 && grid[nx][ny]==1 && !vis[nx][ny]){
                    vis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }

        }
        int count =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]) count++;
            }
        }
        return count;

        

        


    }
    
}