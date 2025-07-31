class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        for(int i =0;i<s.length()-p.length()+1;i++){
            if(fun(p,s.substring(i,i+p.length()))) res.add(i);
        }
        //if(fun(p,s.substring(s.length()-p.length(),s.length()))) res.add(s.length()-p.length());
        return res;

        
    }
    boolean fun(String s,String p){
        int a[]= new int[26];
        for(int i = 0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[p.charAt(i)-'a']--;
        }
        for(int i:a) if(i!=0) return false;

        return true;
    }
}