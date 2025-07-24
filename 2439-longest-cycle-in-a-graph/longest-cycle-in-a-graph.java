class Solution {
    
    public int longestCycle(int[] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            adj.add(new ArrayList<>());

        }
        for(int i =0;i<edges.length;i++){
            if(edges[i]!=-1)adj.get(i).add(edges[i]);
        }
        for(List<Integer>i:adj) System.out.println(i);
        boolean vis[]= new boolean[edges.length];
        int cp[]= new int[edges.length];
        int val[] = new int[1];
        val[0] = -1;
        for(int i=0;i<edges.length;i++){
            if(!vis[i]){
                dfs(0,adj,vis,cp,i,val);
            }
        }
        return val[0];
        

        
    }
    void dfs(int count,List<List<Integer>> adj,boolean vis[],int cp[],int src,int val[]){
        count++;
        vis[src] = true;
        cp[src] = count;
        for(int i :adj.get(src)){
            if(!vis[i]){
                dfs(count,adj,vis,cp,i,val);
            }
            else if(cp[i]!=0){
                val[0]= Math.max(val[0],count-cp[i]+1);

            }

        }
        cp[src] =0;
        return;

    }
}