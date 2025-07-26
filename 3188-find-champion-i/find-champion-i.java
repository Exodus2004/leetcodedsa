class Solution {
    public int findChampion(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            map.put(i,0);
        }
        for(int i=0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    map.put(i,map.get(i)+1);
                }

            }
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
                val = i;

            }

        }
        return val;
        
    }
}