class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int a[][] = new int[n][m];
        List<Integer> r =new ArrayList<>();
        List<Integer> c =new ArrayList<>();
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j =0;j<m;j++){
                max = Math.max(max,grid[i][j]);
            }
            r.add(max);
        }
        for(int i=0;i<m;i++){
            int max = 0;
            for(int j =0;j<n;j++){
                max = Math.max(max,grid[j][i]);
            }
            c.add(max);
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                a[i][j] = Math.min(r.get(i),c.get(j));
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++) sum+=a[i][j]-grid[i][j];
        }

        return sum;


    }
}