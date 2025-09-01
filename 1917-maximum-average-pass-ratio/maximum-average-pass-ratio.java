class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
       PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> {
            double gainA = (a[0] + 1) / (a[1] + 1) - a[0] / a[1];
            double gainB = (b[0] + 1) / (b[1] + 1) - b[0] / b[1];
            return Double.compare(gainB, gainA); 
        });

       for(int i[]:classes){
        
        pq.add(new double[]{i[0],i[1]});
       }
       while(extraStudents>0){
        double best[] =pq.poll();
        double newpass = best[0]+1;
        double newtotal = best[1]+1;
        pq.add(new double[]{newpass,newtotal});
        extraStudents--;
        }
        double sum = 0;
        while(pq.size()!=0){
            double p[]= pq.poll();
            sum+=(p[0]/p[1]);

        }


       return sum/classes.length;


        
    }
}