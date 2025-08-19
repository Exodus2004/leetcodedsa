class Solution {
    public int equalPairs(int[][] grid) {
        int n  =grid.length;
        int m = grid[0].length;
        Map<List<Integer>,Integer> mapr = new HashMap<>();
        Map<List<Integer>,Integer> mapc = new HashMap<>();
        int count = 0;
        for(int i[]:grid){
            List<Integer> row = new ArrayList<>();
            for(int k:i) row.add(k);
            mapr.put(row,mapr.getOrDefault(row,0)+1);
        }
        for(int j = 0;j<m;j++){

            List<Integer> col = new ArrayList<>();
            for(int i = 0;i<n;i++){
                col.add(grid[i][j]);
                

            }
            
              
               mapc.put(col,mapc.getOrDefault(col,0)+1);
        }
        System.out.println(mapr);
        System.out.println(mapc);
    
        for(List<Integer> i:mapr.keySet()){
            if(mapc.containsKey(i)){
                count+=mapr.get(i) * mapc.get(i);
            }
            
        }
        
            

        
        
        return count;
    }

}