class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int t = 0;
        int b = n-1;
        int r = m-1;
        int l= 0;
        List<Integer> res = new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++) res.add(matrix[t][i]);
            t++;
            for(int i = t;i<=b;i++) res.add(matrix[i][r]);
            r--;
            if(t<=b){
                for(int i = r;i>=l;i--) res.add(matrix[b][i]);
            b--;
            }
            if(l<=r){
                for(int i = b;i>=t;i--) res.add(matrix[i][l]);
            l++;
            }
        }
        return res;
        
    }
}