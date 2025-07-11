class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[] = new boolean[rooms.size()];

        Queue<Integer> q = new LinkedList<>();
        vis[0] = true;

        q.add(0);
        

        while(!q.isEmpty()){
            int node  =q.poll();

            for(int i :rooms.get(node)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);

                }
            }
        }
        for(boolean i : vis){
            if(!i){
                return false;
            }
        }
        return true;
        
    }
}