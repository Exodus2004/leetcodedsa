class Solution {
    public void solve(char[][] board) {
        if(board.length==1) return ;
        int n = board.length;
        int m = board[0].length;
        boolean vis[][] = new boolean[n][m];

        
        for(int i=0;i<m;i++) if(board[0][i]=='O') bfs(0,i, board,vis);
        for(int i=0;i<m;i++) if(board[n-1][i]=='O') bfs(n-1,i, board,vis);
        for(int i=0;i<n;i++) if(board[i][0]=='O') bfs(i,0, board,vis);
        for(int i=0;i<n;i++) if(board[i][m-1]=='O') bfs(i,m-1, board,vis);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !vis[i][j]) board[i][j] = 'X';
            }
        }

    }

    void bfs(int k,int j,char [][]a,boolean vis[][]){
        vis[k][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{k,j});
        int nr[] = {0,0,-1,1};
        int nc[] = {-1,1,0,0};

        while(!q.isEmpty()){
            int val[] = q.poll();
            int x = val[0];
            int y = val[1];
        for(int i =0;i<4;i++){
                int nx = nr[i]+x;
                int ny = nc[i]+y;
                if(nx<a.length && ny<a[0].length && nx>=0 && ny>=0 && !vis[nx][ny] && a[nx][ny]=='O'){
                    vis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
        
                }
        }

        }
    }
}