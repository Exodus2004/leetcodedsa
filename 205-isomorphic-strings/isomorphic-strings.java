class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for(int i =0;i<t.length();i++) set.add(t.charAt(i));
        for(int i =0;i<s.length();i++) set1.add(s.charAt(i));
        if(set1.size()!=set.size()) return false;
        

        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(map.containsKey(a)){
                if(map.get(a)!=b) return false;
            }
            map.put(a,b);
            
        }
        return true;
        
    }
}