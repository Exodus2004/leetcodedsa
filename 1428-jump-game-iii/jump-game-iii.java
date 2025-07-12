class Solution {
    public boolean canReach(int[] arr, int start) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<arr.length;i++) adj.add(new ArrayList<>());
       
        
     
     for (int i = 0; i < arr.length; i++) {
        if (i + arr[i] < arr.length)adj.get(i).add(i + arr[i]);
            if (i - arr[i] >= 0) adj.get(i).add(i - arr[i]);
     }

     Queue<Integer> q = new LinkedList<>();
     boolean vis[] = new boolean[arr.length];

     q.add(start);

     vis[start] = true;

     while(!q.isEmpty()){
        int n = q.poll();
        if(arr[n]==0) return true;

        for(int i:adj.get(n)){


            if(!vis[i]){
                vis[i] = true;
                q.add(i);
            }

        }

        

     }
     return false;

       




        
    
     
    } 
}