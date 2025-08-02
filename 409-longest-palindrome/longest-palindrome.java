class Solution {
    public int longestPalindrome(String s) {
        int one = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2==1) one++;
            else one--;
        }
        if(one>1) return s.length()-one+1;

        return s.length();
        

       
        
    }
}