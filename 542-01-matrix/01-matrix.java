class Solution {
    class pair{
        int x;
        int y;
        pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int a[][] =new int[n][m];
        Queue<pair> q= new LinkedList<>();
        int count = 1;

        boolean vis[][] =new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j]==0 && !vis[i][j]){
                    vis[i][j] = true;
                    q.add(new pair(i,j));
                }

            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            for(int c =0;c<size;c++){
                pair node = q.poll();
                int x = node.x;
                int y = node.y;
                int dr[] = {0,0,-1,1};
                int dc[] = {1,-1,0,0};

                for(int i=0;i<4;i++){
                    int nx = x+dr[i];
                    int ny = y+dc[i];
                    if(nx<n && ny<m && nx>=0 && ny>=0 && mat[nx][ny]==1 & !vis[nx][ny]){
                        vis[nx][ny] = true;
                        a[nx][ny] = count;
                        q.add(new pair(nx,ny));
                    }
                }
;                
                
            }

            count++;
        }
        return a;
        

        
    }
}