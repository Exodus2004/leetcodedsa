class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indeg[] = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i =0;i<numCourses;i++) adj.add(new ArrayList<>());

        for(int i[]:prerequisites ){

            adj.get(i[1]).add(i[0]);

        }
        for(int i=0;i<numCourses;i++){
            for(int j :adj.get(i)) indeg[j]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            if(indeg[i]==0) q.add(i);
            
        }
        int count =0;

        while(!q.isEmpty()){
            int node = q.poll();

            count++;
            for(int i :adj.get(node)){
                indeg[i]--;
                if(indeg[i]==0){
                    q.add(i);
                }
            }

        }
        return count==numCourses;
        
    }
}