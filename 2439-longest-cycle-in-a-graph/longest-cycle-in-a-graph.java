class Solution {
    int ans = -1;
    public int longestCycle(int[] edges) {
    
    int n = edges.length;
   

    List<List<Integer>> adj = new ArrayList<>();

    for(int i =0;i<n;i++) adj.add(new ArrayList<>());

    for(int i =0;i<n;i++){
        adj.get(i).add(edges[i]);
        
    }
    for(List<Integer> l:adj) System.out.println(l);

   
    boolean vis[] = new boolean[n];

    for(int i =0;i<n;i++){
        if(!vis[i]){
                                Map<Integer,Integer> map = new HashMap<>();



            map.put(i,1);
            dfs(adj,i,vis,map);
        }
    }

    return ans;
    


    




        
    }
     void dfs(List<List<Integer>> adj,int i,boolean vis[],Map<Integer,Integer> map){

        vis[i] = true;

        int j = adj.get(i).get(0);
    
        
            if(j!=-1 && !vis[j]){
                vis[j] = true;
                map.put(j,map.get(i)+1);
                dfs(adj,j,vis,map);

            }
            else if(j!=-1 && map.containsKey(j)){
               ans = Math.max(ans,map.get(i)-map.get(j)+1);


            }
        
       

        

    }
}