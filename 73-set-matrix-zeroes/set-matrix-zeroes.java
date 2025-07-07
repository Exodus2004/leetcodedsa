class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> l= new ArrayList<>();
        List<Integer> r= new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j]==0){
                    l.add(i);
                    r.add(j);
                    

                }
            }
        }
        System.out.print(l);
        System.out.print(r);
        
        for(int i= 0;i<l.size();i++){
            fun(matrix,l.get(i),r.get(i));
        }
                    
        
    }
    static void fun(int a[][],int p,int q){
       int m = a.length;
       int n = a[0].length;

       for(int i =0;i<m;i++){
        a[i][q] = 0;
       }
       for(int i =0;i<n;i++){
        a[p][i] = 0;

       }
    }
}