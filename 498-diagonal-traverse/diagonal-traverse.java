import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<List<Integer>> list = new ArrayList<>();

        // Initialize list of lists to hold diagonals
        for (int i = 0; i < m + n; i++) {
            list.add(new ArrayList<>());
        }

        // Group elements by their i + j value (diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.get(i + j).add(mat[i][j]);
            }
        }

        // Build the result list, reversing even-numbered diagonals
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                Collections.reverse(list.get(i));
            }
            res.addAll(list.get(i));
        }

        // Convert to array and return
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}