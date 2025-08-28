class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(!map.containsKey(i-j)) map.put(i-j,new PriorityQueue<>());
                map.get(i-j).add(mat[i][j]);

            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                mat[i][j] = map.get(i-j).poll();

            }
        }
        System.out.println(map);
        

        return mat;

        
    }
}