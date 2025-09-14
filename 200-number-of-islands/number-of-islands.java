class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
        
    }
    void bfs(int i,int j,char a[][],boolean vis[][]){
        Queue<int[]> q = new LinkedList<>();
        vis[i][j] = true;
        int n = a.length;
        int m = a[0].length;
        q.add(new int[]{i,j});
        int nr[] = {0,0,-1,1};
        int nc[] = {1,-1,0,0};

        while(!q.isEmpty()){
            int val[] = q.poll();
            int x = val[0];
            int y = val[1];
            for(int k =0;k<4;k++){
                int nx = x+nr[k];
                int ny = y+nc[k];
                if(nx<n && ny<m && nx>=0 && ny>=0 && !vis[nx][ny] && a[nx][ny]=='1'){
                    vis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }

        }
    }
}