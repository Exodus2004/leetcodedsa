class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<List<String>> pq = new PriorityQueue<>((a,b)->{
            return Integer.parseInt(b.get(1))-Integer.parseInt(a.get(1));

        });

        for(int i =0;i<names.length;i++){
            List<String> k =new ArrayList<>();
            k.add(names[i]);
            k.add(String.valueOf(heights[i]));

            pq.add(k);
        }
        String a[] = new String[names.length];
        for(int i=0;i<names.length;i++){
            a[i] = pq.poll().get(0);
        }
        return a;
        
    }
}