class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(char c:s1.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int k= map.size();
        int l = 0;
        int r = 0;


        while(r<s2.length()){
            window.put(s2.charAt(r),window.getOrDefault(s2.charAt(r),0)+1);

            if(r-l+1==s1.length()){
                if(fun(map,window)) return true;
                
                window.put(s2.charAt(l),window.get(s2.charAt(l))-1);
                if(window.get(s2.charAt(l))==0) window.remove(s2.charAt(l));
                l++;

            }
            
            
            r++;
        }
        return false;
        
    }
    boolean fun(Map<Character,Integer> map,Map<Character,Integer> window){

        if(map.size()!=window.size()) return false;
        for(char c:map.keySet()){
            if(!window.containsKey(c)) return false;
            if(!map.get(c).equals(window.get(c))) return false;
        }
        return true;
    }
}