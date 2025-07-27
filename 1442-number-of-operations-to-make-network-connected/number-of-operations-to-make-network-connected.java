class Solution {
    public int makeConnected(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>();
        int c = -1;
        for(int i =0;i<n;i++) adj.add(new ArrayList<>());
        boolean vis[]= new boolean[n];

        for(int i []:connections){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);

        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                bfs(adj,vis,i);
            }
        }
        return connections.length>=n-1?c:-1;

        
    }
    static void bfs(List<List<Integer>> adj , boolean vis[],int src){

        vis[src] = true;

        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        while(!q.isEmpty()){
            int node = q.poll();

            for(int i :adj.get(node)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

    }
}