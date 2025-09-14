class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        List<List<Integer>> adj = new ArrayList<>();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for (int i[] : prerequisites) {
            adj.get(i[1]).add(i[0]);
            a[i[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                q.add(i);
        }
        List<Integer> res = new ArrayList<>();
        int count = 0;
        while (!q.isEmpty()) {
            int val = q.poll();
            count++;
            for (int i : adj.get(val)) {
                a[i]--;
                if (a[i] == 0)
                    q.add(i);
            }
        }
        return count == n;

    }
}