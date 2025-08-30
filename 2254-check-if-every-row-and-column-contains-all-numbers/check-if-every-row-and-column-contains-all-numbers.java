class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i[]:matrix){
           Set<Integer> set = new HashSet<>();
           for(int j:i){
            set.add(j);
           }
           if(set.size()!=n) return false;
        }
        for(int i = 0;i<n;i++){
            Set<Integer> col = new HashSet<>();
            for(int j = 0;j<n;j++){
                col.add(matrix[j][i]);

            }
            if(col.size()!=n) return false;
        }
        return true;
        
    }
}