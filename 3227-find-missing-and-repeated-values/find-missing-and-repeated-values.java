class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        int a[] = new int[2];
        int n = grid.length;
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++) map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);

        }

           for(int i=1;i<=n*n;i++){
            if(!map.containsKey(i)) a[1] =i;
            else if(map.get(i)==2) a[0] = i;
            }

           


           return a;
        
    }
}