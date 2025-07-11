class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++) adj.add(new ArrayList<>());
        Set<String> set = new HashSet<>();

        for(int i =0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
            set.add(connections[i][0]+">"+connections[i][1]);
        }
        for(List<Integer> i:adj) System.out.println(i);

        System.out.println(set);

        Queue<Integer> q = new LinkedList<>();
        boolean vis[]= new boolean[n];
        int rev =0;

        vis[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i:adj.get(node)){
                if(!vis[i]){
                    if(set.contains(node+">"+i)) rev++;
                    vis[i] = true;
                    q.add(i);
                }
            }

        }
        System.out.println(Arrays.toString(vis));
        return rev;
        
    }
}