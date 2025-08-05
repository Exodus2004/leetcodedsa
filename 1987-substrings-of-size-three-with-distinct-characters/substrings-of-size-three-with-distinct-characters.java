class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i =0;i<s.length()-2;i++){
            if(check(s.substring(i,i+3))) count++;
        }
        return count;
        
    }
    boolean check(String s){
        Set<Character> set = new HashSet<>();

        for(char c:s.toCharArray()) set.add(c);

        return set.size()==3;
    }

}