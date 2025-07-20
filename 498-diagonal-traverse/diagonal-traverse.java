class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<List<Integer>> list = new ArrayList<>();

        for(int i =0;i<m+n;i++) list.add(new ArrayList<>());

        

       
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i==0 && j==0) continue;
                
                    list.get(i+j).add(mat[i][j]);
                
                
            }
            
        }
        List<Integer> res = new ArrayList<>();
        res.add(mat[0][0]);
        for(int i =0;i<m+n;i++){
            if(i%2==0) Collections.reverse(list.get(i));

            for(int j :list.get(i)) res.add(j);
        }
        System.out.println(res);
        

        int a[] = new int[res.size()];
        for(int i=0;i<res.size();i++) a[i] = res.get(i);

        return a;






        
    }
    // 00 01 10 20 11 02 12 21 22 
}