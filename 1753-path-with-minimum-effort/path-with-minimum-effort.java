class Solution {
    class pair{
        int x;
        int y;
        int weight;
        pair(int x,int y,int weight){
            this.x =x;
            this.y = y;
            this.weight = weight;
        }
    }
    public int minimumEffortPath(int[][] heights) {


        int n = heights.length;
        int m = heights[0].length;
        if(n==1 && m==1) return 0;
        int dis[][] = new int[n][m];
        

        for(int i[]:dis) Arrays.fill(i,Integer.MAX_VALUE);
        dis[0][0]  =0;

        PriorityQueue<pair> q = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));

        q.add(new pair(0,0,0));

        while(!q.isEmpty()){
            pair node=q.poll();

            int presentx = node.x;
            int presenty = node.y;
            int weight = node.weight;
            int dr[] = {0,0,-1,1};
            int dc[] = {-1,1,0,0};
            for(int i =0;i<4;i++){
                int nx= presentx+dr[i];
                int ny = presenty+dc[i];
                if(nx<n  && ny<m && nx>=0 && ny>=0){
                    int newdis = Math.max(weight,Math.abs(heights[presentx][presenty]-heights[nx][ny]));
                    if(newdis<dis[nx][ny]){
                        dis[nx][ny] = newdis;
                        q.add(new pair(nx,ny,newdis));
                    }
                }
            }

        }
        return dis[n-1][m-1];







        
    }
}