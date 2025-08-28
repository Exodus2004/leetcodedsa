class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int a[][]= new int[n][m];
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                map.putIfAbsent(i-j,new ArrayList<>());
                map.get(i-j).add(grid[i][j]);

            }
        }
        for(int i:map.keySet()){
            if(i<0){
                Collections.sort(map.get(i));

            }
            else{
                Collections.sort(map.get(i),Collections.reverseOrder());

            }
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j< m;j++){
                a[i][j] = map.get(i-j).get(0);
                map.get(i-j).remove(0);
            }
        }
        return a;

        
        
    }
}