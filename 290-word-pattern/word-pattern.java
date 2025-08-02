class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[] = s.trim().split(" ");
        if(pattern.length()!=a.length) return false;
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        for(int i =0;i<pattern.length();i++){
            char c= pattern.charAt(i);
            String q = a[i];

            if(!map1.containsKey(c)) map1.put(c,a[i]);
            if(!map2.containsKey(a[i])) map2.put(a[i],c);

            if(!map1.get(c).equals(q)|| map2.get(q)!= c) return false;
        }
        return true;

        
    }
}