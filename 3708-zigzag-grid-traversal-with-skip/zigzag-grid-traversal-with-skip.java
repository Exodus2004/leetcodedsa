class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        List<Integer> l = new ArrayList<>();
        boolean flag = true;
        

        for(int i =0;i<n;i++){
            if(flag){
                for(int j=0;j<m;j++){
                if((i+j)%2==0) l.add(grid[i][j]);
                
            }
            flag = !flag;
            
            }
            else{
                for(int j =m-1;j>=0;j--){
                if((i+j)%2==0) l.add(grid[i][j]);
                }
                flag = !flag;
            }
            
            
        }
        return l;
        
    }
}