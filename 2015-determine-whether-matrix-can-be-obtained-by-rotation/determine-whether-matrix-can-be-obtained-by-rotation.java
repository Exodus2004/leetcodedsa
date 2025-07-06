class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if(Arrays.deepEquals(mat,target)) return true;

        int res1[][] = new int[n][n];

        //first 90

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                res1[i][j]=mat[n-j-1][i];
            }
        }
        if(Arrays.deepEquals(res1,target)) return true;

        int res2[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                res2[i][j] = res1[n-j-1][i];
            }
        }
        if(Arrays.deepEquals(res2,target)) return true;
        int res3[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                res3[i][j] = res2[n-j-1][i];
            }
        }
        if(Arrays.deepEquals(res3,target)) return true;





        return false;



        
    }
}