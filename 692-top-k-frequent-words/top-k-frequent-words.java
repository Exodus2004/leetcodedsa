class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s:words) map.put(s,map.getOrDefault(s,0)+1);
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
           return a.getValue().equals(b.getValue())?b.getKey().compareTo(a.getKey()):a.getValue()-b.getValue();
        });

        for(Map.Entry<String,Integer> e:map.entrySet()){
            pq.add(e);
            if(pq.size()>k) pq.poll();
        }
        List<String> set = new LinkedList<>();
        while(pq.size()!=0) set.addFirst(pq.poll().getKey());

        return set;
        
    }
}