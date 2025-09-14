class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean vis[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int nr[] = {0,0,-1,1};
        int nc[]= {-1,1,0,0};
        
        Set<List<Integer>> pacific = new HashSet<>();
        for(int i=0;i<m;i++){
            q.add(new int[]{0,i});
            vis[0][i] = true;
        }
        for(int i=0;i<n;i++){
            q.add(new int[]{i,0});
            vis[i][0] = true;
        }
        while(!q.isEmpty()){
            int val[] = q.poll();
            int x = val[0];
            int y = val[1];
            pacific.add(Arrays.asList(x,y));
            for(int i=0;i<4;i++){
                int nx = x+nr[i];
                int ny = y+nc[i];
                if(nx<n && ny<m && nx>=0 && ny>=0 && !vis[nx][ny] && heights[nx][ny]>=heights[x][y]){
                    vis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }


        }
        boolean nvis[][] = new boolean[n][m];
        Set<List<Integer>> atlantic  = new HashSet<>();
        for(int i=0;i<n;i++){
            q.add(new int[]{i,m-1});
            nvis[i][m-1] = true;
        }
        for(int i=0;i<m;i++){
            q.add(new int[]{n-1,i});
            nvis[n-1][i] = true;
        }
        while(!q.isEmpty()){
            int val[] = q.poll();
            int x = val[0];
            int y = val[1];
            atlantic.add(Arrays.asList(x,y));
            for(int i=0;i<4;i++){
                int nx = x+nr[i];
                int ny = y+nc[i];
                if(nx<n && ny<m && nx>=0 && ny>=0 && !nvis[nx][ny] && heights[nx][ny]>=heights[x][y]){
                    nvis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }


        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                List<Integer> tem =new ArrayList<>();
                tem.add(i);
                tem.add(j);
                if(pacific.contains(tem) && atlantic.contains(tem)) res.add(tem);
            }
        }


        return res;

                
    }
}