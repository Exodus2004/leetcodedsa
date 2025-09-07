class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return b[k]-a[k];

        });
        for(int i[]:score) pq.add(i);
        int a[][]  =new int[score.length][score[0].length];
        int i =0;
        while(!pq.isEmpty()){
            a[i] = pq.poll();
            i++;
        }
        return a;
        
    }
}