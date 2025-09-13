class Solution {
    public String longestPalindrome(String s) {
        int maximumlength = 1;// all the letters are palindromes
        int startingindex = 0;
        for(int i =0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                if(j-i+1>maximumlength && valid(s,i,j)){
                    startingindex = i;
                    maximumlength = j-i+1;
                }

            }
        }
        return s.substring(startingindex,startingindex+maximumlength);
        
    }
    boolean valid(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}