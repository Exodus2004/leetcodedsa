class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
        int disa = (a[0])*(a[0])+(a[1])*(a[1]);
        int disb = (b[0])*(b[0])+(b[1])*(b[1]);
        return disa-disb;

    });
    for(int i[]:points) pq.add(new int[]{i[0],i[1]});
   
    int a[][] = new int[k][2];
    for(int i =0;i<k;i++){
        int x[] = pq.poll();
        a[i][0] =x[0];
        a[i][1] =x[1];
    }
    return a;
        
    }
}