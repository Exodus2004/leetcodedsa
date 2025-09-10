class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{return a[1]-b[1];});
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            pq.add(new int[]{e.getKey(),e.getValue()});
            if(pq.size()>k) pq.poll();
        }
        int a[] = new int[k];
        int i=0;
        while(pq.size()!=0){
            a[i++] = pq.poll()[0];
        }
        return a;


        
    }
}