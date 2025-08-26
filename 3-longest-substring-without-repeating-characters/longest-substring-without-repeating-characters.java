class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;


            }
            set.add(s.charAt(r));
            
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;

        
        
    }
}