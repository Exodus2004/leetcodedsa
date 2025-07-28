class Solution {
    class pair{
        int x;
        int y;
        int val;
        pair(int x,int y,int val){
            this.x = x;
            this.y = y;
            this.val = val;



        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int count[] =new int[1];
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;
        boolean vis[][] =new boolean[grid.length][grid[0].length];
        
        int x = 0;
        int y = 0;

       return bfs(0,0,vis,1,grid);
        
        
        

        
        
    }
     int bfs(int x,int y,boolean vis[][],int val,int a[][]){
        
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(x,y,val));
        int nr[]={0,0,-1,1,1,1,-1,-1};
        int nc[] ={-1,1,0,0,1,-1,-1,1};

        while(!q.isEmpty()){
            pair node = q.poll();
            int r = node.x;
            int c = node.y;
            int v = node.val;
            
            if(r==vis.length-1 && c ==vis[0].length-1) return v;

            for(int i =0;i<8;i++){
                int nx = r+ nr[i];
                int ny = c+ nc[i];
                if(nx>=0 && ny>=0 && nx<vis.length && ny<vis[0].length && !vis[nx][ny] && a[nx][ny]==0){
                    vis[nx][ny] = true;
                    
                    q.add(new pair(nx,ny,v+1));
                    
                }
            }
            

        }
        return -1;

    }
}