class Solution {
    class pair{
        int first;
        int second;
        int time;
        pair(int first ,int second,int time){
            this.time = time;
            this.first = first;
            this.second = second;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int a[][] = new int[m][n];

        Queue<pair> q = new LinkedList<>();
        int freshcount = 0;

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){

                

                if(grid[i][j]==2){
                    a[i][j] = 2;
                    q.add(new pair(i,j,0));
                }
                if(grid[i][j]==1) freshcount++;
            }
        }
        int count =0;

        while(!q.isEmpty()){
            pair temp = q.poll();
            int x = temp.first;
            int y = temp.second;
            int t = temp.time;
            count = Math.max(count,t);
            int drow[] = {0,+1,-1,0};
            int dcol[] = {+1,0,0,-1};

            for(int i =0;i<4;i++){
                int nrow = x+drow[i];
                int ncol =y+dcol[i]; 

                if(nrow>=0 && ncol>=0 && nrow<m&& ncol<n && grid[nrow][ncol]==1 && a[nrow][ncol]!=2){
                    a[nrow][ncol] = 2;
                    q.add(new pair(nrow,ncol,t+1));
                }
            }


           



        }
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==1 && a[i][j]!=2) return -1;
            }
        }
        return count; 
    }
}
