class Solution {
    public boolean closeStrings(String word1, String word2) {
        TreeSet<Character> ta = new TreeSet<>();
        TreeSet<Character> tb = new TreeSet<>();
        for(char c:word1.toCharArray()) ta.add(c);
        for(char c:word2.toCharArray()) tb.add(c);
        if(!ta.equals(tb)) return false;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        
        for(char c: word1.toCharArray()) map1.put(c,map1.getOrDefault(c,0)+1);
        for(char c: word2.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);
        System.out.println(map1);
        System.out.println(map2);
        
        List<Integer> al = new ArrayList<>(map1.values());
        List<Integer> bl= new ArrayList<>(map2.values());
        Collections.sort(al);
        Collections.sort(bl);
        
        return al.equals(bl);

        
    }
}