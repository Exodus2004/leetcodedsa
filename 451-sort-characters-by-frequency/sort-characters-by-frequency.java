class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<Character,Integer> e:map.entrySet()) q.add(e);
        
        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){
            Map.Entry<Character,Integer> en = q.poll();
            int val = en.getValue();
            char a = en.getKey();
            for(int i =0;i<val;i++) sb.append(a);

        }
        return sb.toString();
        
    }
}