class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
      int l[] = new int[numCourses]; 

      for(int i =0;i<numCourses;i++){
        adj.add(new ArrayList<>());
      }
      int indegree[] = new int[numCourses];
      for(int pre[]:prerequisites){
        
        adj.get(pre[1]).add(pre[0]);
        indegree[pre[0]]++;


      }
      

    //   for(int i=0;i<numCourses;i++){
    //     for(int it:adj.get(i)) indegree[it]++;
    //   }
    int k =0;

      Queue<Integer> q = new LinkedList<>();

      for(int i=0;i<numCourses;i++){
        if(indegree[i]==0) q.add(i);
      }
      int count=0;

      while(!q.isEmpty()){

        int ele = q.poll();
        l[k] = ele;
        k++;
        count++;
        for(int i:adj.get(ele)){
            indegree[i]--;
            if(indegree[i]==0) q.add(i);
        }
        
      }

      return count==numCourses?l:new int []{};

        
    }
}