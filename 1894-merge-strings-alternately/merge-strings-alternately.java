class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder();
        int i = 0;
        int j = 0;
        String res ="";

        while(i<word1.length() || j<word2.length()){
            if(i<word1.length())res+=(word1.charAt(i++));
            if(j<word2.length())res+=(word2.charAt(j++));
        }
        return res;
    }
}