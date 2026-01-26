class Solution {
    public int maxDistinct(String s) {
    Map<Character,Integer> map = new HashMap<>();

    for(char c: s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);

    int max = 0;
    for(char c:map.keySet()){
        max = Math.max(max,map.get(c));
    }
        return map.size();
    }
}