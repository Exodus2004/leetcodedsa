class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> set = new ArrayList<>();
        String p  = "";

        for(String s:words){
            char a[] = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!key.equals(p)){
                set.add(s);
                p = key;
            }

        }
        return set;
        
    }
}