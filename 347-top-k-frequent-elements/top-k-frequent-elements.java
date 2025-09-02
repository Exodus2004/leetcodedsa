class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        System.out.println(map);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });
        for(int i:map.keySet()) pq.add(new int[]{i,map.get(i)});

        int x[] =new int[k];
        for(int i=0;i<k;i++){
            int val[] =pq.poll();
            x[i] = val[0];
        }

        return x;
        
    }
}