class Solution {
    class pair{
        int s;
        int d;
        int w;
        pair(int s,int d,int w){
            this.s = s;
            this.d= d;
            this.w = w;
        }
    }
    int ans = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {

      
      List<List<int[]>> adj = new ArrayList<>();

      for(int i =0;i<=n;i++) adj.add(new ArrayList<>());

      for(int i =0;i<roads.length;i++){

        adj.get(roads[i][0]).add(new int[]{roads[i][1],roads[i][2]});
        adj.get(roads[i][1]).add(new int[]{roads[i][0],roads[i][2]});
        
      }

        boolean vis[] = new boolean[n+1];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        
            
        bfs(adj,vis,1);
            

        
        return ans;

        
    }
    void bfs(List<List<int[]>>adj,boolean vis[],int src){
        vis[src] = true;

        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        while(!q.isEmpty()){
            int n = q.poll();

            for(int i[]:adj.get(n)){
                int des = i[0];
                int weight = i[1];
                ans = Math.min(ans,weight);

                if(!vis[des]){
                    vis[des] = true;
                    q.add(des);

                    
                }
            }
        }



    }
}