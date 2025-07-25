class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<colors.length();i++) adj.add(new ArrayList<>());


        int grid[][] = new int[colors.length()][26];
        int indeg[] = new int[colors.length()];
        for(int i[]:edges){
            adj.get(i[0]).add(i[1]);
            indeg[i[1]]++;
            
        }
           int max = Integer.MIN_VALUE;
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0) q.add(i);
        }   


        List<Integer> l = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.poll();
            l.add(node);
            grid[node][(int)(colors.charAt(node)-'a')]++;

            max = Math.max(grid[node][(int)(colors.charAt(node)-'a')],max);

            for(int i :adj.get(node)){
                if(indeg[i]!=0){
                    indeg[i]--;
                    if(indeg[i]==0) q.add(i);
                }
                for(int j = 0;j<26;j++){
                    grid[i][j] = Math.max(grid[i][j],grid[node][j]);
                }
            }
        }
        if(l.size()!=colors.length()) return -1;
        
          
        return max;
    }
}