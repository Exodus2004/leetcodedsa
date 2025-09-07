class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        

        List<List<Integer>> res = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[1]-b[1];

        });
        for(int i=0;i<groupSizes.length;i++) pq.add(new int[]{i,groupSizes[i]});
        List<Integer> temp = new ArrayList<>();
        

        while(!pq.isEmpty()){
            int c[] = pq.poll();
            temp.add(c[0]);
            if(temp.size()==c[1]){
            res.add(new ArrayList<>(temp));
            temp.clear();
            }


        }
        return res;


        
    }
}