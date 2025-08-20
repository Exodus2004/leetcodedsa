class Solution {
    public int kthSmallest(int[][] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                pq.add(a[i][j]);

                if(pq.size()>k) pq.poll();
            }
        }
        return pq.peek();
    }
}