class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int n = s.length();
        int l = 0;
        int r = 0;
        int k = p.length();
        List<Integer> res = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(char c:p.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);


        while(r<n){
           window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            


            while(r-l+1>k){
                
                System.out.println(fun(window,map));

                window.put(s.charAt(l),window.get(s.charAt(l))-1);

                if(window.get(s.charAt(l))==0) window.remove(s.charAt(l));

                l++;
            
                
               
                
            }
            if(fun(window,map)) res.add(l);
           
            r++;

        }
        ;
        //
        return res;
        
    }
    boolean fun(Map<Character,Integer> a,Map<Character,Integer> b){
         if(a.size()!=b.size()) return false;

         for(char key:a.keySet()){
            if(!b.containsKey(key)) return false;
            int q = a.get(key);
            int p = b.get(key);
            if(q!=p) return false;
         }

         return true;

        
    }
}