class Solution {
    int e =0,v=0;
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i =0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);

        }
        for(List<Integer> i:adj) System.out.println(i);

        int count  = 0;
        
        boolean vis[] = new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]){
                e=0;
                v=0;
                
               
                fun(adj,vis,i);
                e = e/2;

                
                if(e == (v * (v - 1) / 2)) count++;


                
            }
            
        }
        return count;

        
    }
     void fun(List<List<Integer>> adj, boolean vis[],int src){
        Queue<Integer> q = new LinkedList<>();
        v++;
        vis[src] =true;

        q.add(src);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i :adj.get(node)){
                e++;
                if(!vis[i]){
                    v++;
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

    }
}