class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> forward = new ArrayList<>();    
        List<List<Integer>> backward = new ArrayList<>();

        for(int i =0;i<n;i++){
            forward.add(new ArrayList<>());
            backward.add(new ArrayList<>());
        }  

        for(int i []:connections){
            forward.get(i[0]).add(i[1]);
            backward.get(i[1]).add(i[0]);


        }
        boolean vis[] = new boolean[n];
        int count[]= new int[1];
        count[0] = 0;

            dfs(forward,backward,count,vis,0);

            return count[0];
        
    }
    static void dfs(List<List<Integer>> forward,List<List<Integer>> backward, int count[],boolean vis[],int s){
        vis[s] = true;
        for(int i:forward.get(s)){
            
            if(!vis[i]){
                count[0]++;
                dfs(forward,backward,count,vis,i);
            }
        }
        for(int i:backward.get(s)){
            if(!vis[i]) dfs(forward,backward,count,vis,i);
        }

    }
}