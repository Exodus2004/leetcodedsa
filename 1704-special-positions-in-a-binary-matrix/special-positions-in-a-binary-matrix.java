class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j]==1 && fun(mat,i,j)){
                    count++;
                }
            }
        }
        return count;
        
    }
    boolean fun(int a[][],int x,int y){
        int n = a.length;
        int m = a[0].length;
        boolean row = true;
        boolean col = true;
        for(int i=0;i<m;i++){
            
            if(a[x][i]==1 && i!=y) row = false;
        }
        for(int i=0;i<n;i++){
            


            if(a[i][y]==1 && x!=i) col = false;
        }
        return row & col;

    }
}