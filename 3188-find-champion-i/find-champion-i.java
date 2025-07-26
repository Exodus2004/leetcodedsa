class Solution {
    public int findChampion(int[][] grid) {
        int intialwinner = 0;

        for(int i =0;i<grid.length;i++){
            if(grid[i][intialwinner]==1) intialwinner = i;
        }
        return intialwinner;
        
    }
}