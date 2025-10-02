class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i[]:times){
            adj.get(i[0]).add(new int[]{i[1],i[2]});
        }
        int dis[] = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k] = 0;
        dis[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[1]-b[1];
        });
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int val[] = pq.poll();
            int node = val[0];
            int w = val[1];
            for(int i[]:adj.get(node)){
                int newnode = i[0];
                int d = i[1];
                int nd = d+w;
                if(dis[newnode]>nd){
                    dis[newnode] = nd;
                    pq.add(new int[]{newnode,nd});
                }
            }

        }
        int max = 0;
        for(int i:dis) max = Math.max(max,i);
        return max==Integer.MAX_VALUE?-1:max;

        
    }
}