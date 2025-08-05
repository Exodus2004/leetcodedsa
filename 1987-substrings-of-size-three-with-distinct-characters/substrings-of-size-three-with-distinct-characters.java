class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0;
        int l =0;
       int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int r =0;r<n;r++){
            char a = s.charAt(l);
            char b= s.charAt(r);
            map.put(b,map.getOrDefault(b,0)+1);
            if(r-l+1==3){
                if(map.size()==3) res++;
                map.put(a,map.get(a)-1);
                if(map.get(a)==0) map.remove(a);
                l++;
            }




        }
        return res;
        
    }
}