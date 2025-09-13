class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        String x = "";
        Map<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int size = map.size();
        int l = 0;
        int r = 0;
        Map<Character,Integer> window = new HashMap<>();
        int formed = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;

        while(r<s.length()){
            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            while(valid(map,window)){
                if(len>r-l+1){
                    start = l;
                    len = r-l+1;
                }
               
                window.put(s.charAt(l),window.get(s.charAt(l))-1);
                if(window.get(s.charAt(l))==0) window.remove(s.charAt(l));
                l++;


            }
            r++;
        }
        return len==Integer.MAX_VALUE?"" :s.substring(start,start+len);

        
    }
    boolean valid(Map<Character,Integer> map ,Map<Character,Integer> window){
        for(char c:map.keySet()){
            if(!window.containsKey(c)) return false;
            if(map.get(c)>window.get(c)) return false;
        }
        return true;

    }
}