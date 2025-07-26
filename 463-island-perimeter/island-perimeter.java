class Solution {
    class pair {
        int x, y;

        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count[] = new int[1];
        boolean vis[][] = new boolean[n][m];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == 1) {
                    bfs(i, j, vis, count, grid);
                }
            }
        }
        return count[0];
    }

    void bfs(int i, int j, boolean vis[][], int count[], int grid[][]) {
        vis[i][j] = true;

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i, j));
        int dr[] = { 0, 0, -1, 1 };
        int dc[] = { 1, -1, 0, 0 };

        while (!q.isEmpty()) {
            pair node = q.poll();
            int x = node.x;
            int y = node.y;
            if (grid[x][y] == 1) {
             if (x == 0 || grid[x - 1][y] == 0)
                    count[0]++;
             if (x == grid.length - 1 || grid[x + 1][y] == 0)
                    count[0]++;
             if (y == 0 || grid[x][y - 1] == 0)
                    count[0]++;
            if (y == grid[0].length - 1 || grid[x][y + 1] == 0)
                    count[0]++;

            }

            for (int k = 0; k < 4; k++) {
                int nr = x + dr[k];
                int nc = y + dc[k];

                if (nr < grid.length && nc < grid[0].length && nr >= 0 && nc >= 0 && !vis[nr][nc]) {
                    vis[nr][nc] = true;
                    q.add(new pair(nr, nc));
                }
            }

        }
    }

}