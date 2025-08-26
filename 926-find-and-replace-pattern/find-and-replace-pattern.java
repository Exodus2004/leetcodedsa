class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String s:words){
            if(fun(s,pattern)) res.add(s);
        }
        return res;
        
    }
    boolean fun(String s,String p){
        int ds = 0;
        int dp = 0;
        Set<Character> a = new HashSet<>();
        Set<Character> b = new HashSet<>();
        for(int i =0;i< s.length();i++){
            a.add(s.charAt(i));
            b.add(p.charAt(i));
        }
        if(a.size()!=b.size()) return false;
        
        if(ds!=dp) return false;
        if(s.length()!=p.length()) return false;
        Map<Character,Character> map =new HashMap<>();
        for(int i = 0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=p.charAt(i)) return false;
            }
            map.put(s.charAt(i),p.charAt(i));
        }

        return true;
    }
}