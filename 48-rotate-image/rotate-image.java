class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0;i<n;i++){
            for(int j = i+1;j<m;j++){
                int t = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = t;
            }
        }
        
        for(int i[]:matrix){
            swap(i);
        }
        
    }
    void swap(int a[]){
        int l = 0;
        int  r= a.length-1;
        while(l<r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}