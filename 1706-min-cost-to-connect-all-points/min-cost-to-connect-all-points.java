class Solution {
    public int minCostConnectPoints(int[][] points) {
        int sum =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[1]-b[1];
        });
        Set<String> seen = new HashSet<>();
        pq.add(new int[]{0,0,-1});
    
        while(!pq.isEmpty()){
            int val[] = pq.poll();
            int nextnodeindex = val[0];
            int weight = val[1];
            if(seen.contains(fun(points,nextnodeindex))) continue;
            seen.add(fun(points,nextnodeindex));
            sum+=weight;
            for(int i=0;i<points.length;i++){
                if(!seen.contains(fun(points,i))){
                    int dis = man(points,nextnodeindex,i);
                    pq.add(new int[]{i,dis,nextnodeindex});
                
                }
            }
        }
        return sum;
        
    }
    int man(int a[][],int present,int next){
        int x1 = a[present][0];
        int y1 = a[present][1];
        int x2 = a[next][0];
        int y2 = a[next][1];
        return Math.abs(x1-x2)+Math.abs(y1-y2);

    }
    String fun(int[][]a,int i){
        StringBuilder sb = new StringBuilder();
        sb.append(a[i][0]);
        sb.append(a[i][1]);
        return sb.toString();

    }
}