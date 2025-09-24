class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++) adj.add(new ArrayList<>());
        int in[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j:graph[i]){
                adj.get(j).add(i);
                in[i]++;
                
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<graph.length;i++){
            if(in[i]==0){
                set.add(i);
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            set.add(x);
            for(int i:adj.get(x)){
                in[i]--;
                if(in[i]==0) q.add(i);
            }
        }

        return new ArrayList<>(set);
    }
}