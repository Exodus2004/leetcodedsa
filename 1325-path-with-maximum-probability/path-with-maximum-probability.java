class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<double[]>> adj = new ArrayList<>();
        for(int i =0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new double[]{v, prob});
            adj.get(v).add(new double[]{u, prob});
        }
        double dis[] = new double[n];
        Arrays.fill(dis,Double.MIN_VALUE);
        dis[start_node] =1;
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)->Double.compare(b[1],a[1]));
        pq.add(new double[]{start_node,1});
        while(!pq.isEmpty()){
            double val[] = pq.poll();
            double node = val[0];
            double w = val[1];
            for(double i[]:adj.get((int)node)){
                double newnode = i[0];
                double weight =i[1];
                double nd = weight*w;
                if(nd>dis[(int)newnode]){
                    dis[(int)newnode] = nd;
                    pq.add(new double[]{newnode,nd});
                }
            }
        }
        
        return dis[end_node];

        
    }
}