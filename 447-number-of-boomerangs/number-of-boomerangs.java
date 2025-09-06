class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int val = dx * dx + dy * dy;
                map.put(val, map.getOrDefault(val, 0) + 1);

            }
            System.out.println(map);
            for (int val : map.values())
                max += val * (val - 1);

        }

        return max;

    }
}