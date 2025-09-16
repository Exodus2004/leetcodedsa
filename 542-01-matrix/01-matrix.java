class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int a[][] = new int[n][m];
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
         boolean vis[][] = new boolean[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0 && !vis[i][j]) {
                    vis[i][j] = true;
                    q.add(new int[]{i,j});
                }

            }
        }
        int nr[] = {1,-1,0,0};
        int nc[] = {0,0,-1,1};

        while(!q.isEmpty()){
            int p = q.size();
            for(int i=0;i<p;i++){
                int val[] =q.poll();
                int x = val[0];
                int y = val[1];
                a[x][y]= count;
                for(int k =0;k<4;k++){
                    int nx = x+nr[k];
                    int ny = y+nc[k];
                    if(nx>=0 && ny>=0 && nx<n && ny<m && mat[nx][ny]==1 && !vis[nx][ny]){
                        vis[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                    }
                }
                
            }
            count++;
        }
        return a;

    }
}