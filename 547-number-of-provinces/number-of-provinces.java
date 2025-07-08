class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m= isConnected.length;
        int n = isConnected[0].length;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i =0;i<m;i++){
            adj.add(new ArrayList<>());

        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                

                if(isConnected[i][j]==1 && i!=j) adj.get(i).add(j);
            }
        }

        boolean vis[] = new boolean[m];
        int count =0;

        for(int i =0;i<m;i++){
            if(!vis[i]){
                count++;
                fun(adj,vis,i);
            }


        }
        return count;

        



        
    }
    static void fun(List<List<Integer>> adj,boolean vis[],int src){

        Queue<Integer> q = new LinkedList<>();
        vis[src]=true;

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