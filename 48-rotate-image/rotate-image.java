class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int a[][] = new int[m][n];

        for(int i =0;i<m;i++){
            for(int j =i+1;j<n;j++){
                int t= matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = t;
            }
        }
        // for(int i =0;i<m;i++){
        //     for(int j =0;j<n;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        // }
        for(int i[]:matrix){
            fun(i);
        }
       
        
    }
    static void fun(int a[]){
        int n = a.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}