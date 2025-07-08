class Solution {
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj  =new ArrayList<>();

        int m = graph.length;
        int n = graph[0].length;
        for(int i = 0;i<m;i++) adj.add(new ArrayList<>());
        

        for(int i =0;i<m;i++){
            for(int j = 0;j<graph[i].length;j++){
                
                adj.get(i).add(graph[i][j]);
            }

        }

        int col[] = new int[m];
        Arrays.fill(col,-1);

        for(int i =0;i<m;i++){
            if(col[i]==-1){
                if(!fun(adj,col,i)) return false;
            }
        }
        return true;
        
    }
    static boolean fun(List<List<Integer>> adj,int []col,int src){

        col[src] = 0;

        Queue<Integer> q = new LinkedList<>();


        q.add(src);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i :adj.get(node)){


                if(col[i]==-1){
                    col[i] = 1-col[node];
                    q.add(i);
                }
                else if(col[i]==col[node]){
                    return false;
                }
            }
        }

        return true;


    }
}