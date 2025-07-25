class Solution {
    class pair{
        int x,y;
        pair(int x,int y){
            this.x = x;
            this.y = y;

        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int a[][] =new int[image.length][image[0].length];

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++) a[i][j] = image[i][j];


        }
        a[sr][sc] = color;
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(sr,sc));
        while(!q.isEmpty()){
            pair node = q.poll();

            int x = node.x;
            int y = node.y;
            int dr[] = {-1,1,0,0};
            int dc[] = {0,0,-1,+1};
            for(int i =0;i<4;i++){
                int nr = x+dr[i];
                int nc = y+dc[i];

                if(nr<m && nc<n&& nr>=0 && nc>=0 && a[nr][nc]!=color && a[nr][nc]==image[sr][sc]){
                    a[nr][nc] = color;
                    q.add(new pair(nr,nc));
                }
            }
            
        }
        return a;



        
    }
}