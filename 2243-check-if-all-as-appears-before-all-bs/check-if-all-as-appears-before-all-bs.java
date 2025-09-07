class Solution {
    public boolean checkString(String s) {
        int start = 0;
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()) set.add(c);
        if(set.size()==1) return true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                start = i;
                break;
            }
        }
        
        for(int i=start;i<s.length();i++){
            if(s.charAt(i)=='a') return false;
        }
        return true;
        
    }
}