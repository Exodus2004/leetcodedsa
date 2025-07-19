class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();

        int n = s.length();;

        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(c)){
                if(map.get(c)!=b) return false;
            }
            else if(map1.containsKey(b)){
                if(map1.get(b)!=c) return false;
            }
           else{
            map.put(c,b);
            map1.put(b,c);

           } 
        }

        return true;
        
    }
}