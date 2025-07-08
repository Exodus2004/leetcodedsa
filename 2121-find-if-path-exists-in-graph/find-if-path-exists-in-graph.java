class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int m = edges.length;
        

        List<List<Integer>> adj = new ArrayList<>();

        for(int i =0;i<n;i++) adj.add(new ArrayList<>());


        boolean vis[] = new boolean[n];

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }


         vis[source] = true;
         Queue<Integer> q = new LinkedList<>();

         q.add(source);
         while(!q.isEmpty()){
            int node = q.poll();
            for(int i :adj.get(node)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        return vis[destination];





    
        
    }
}