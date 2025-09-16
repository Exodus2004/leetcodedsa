class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
             int da = Math.abs(a-x);
             int db =Math.abs(b-x);
             if(da!=db) return db-da;
             return b-a;
            

        });

        for(int i:arr){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()) res.add(pq.poll());
        Collections.sort(res);
        return res;

        
    }
}