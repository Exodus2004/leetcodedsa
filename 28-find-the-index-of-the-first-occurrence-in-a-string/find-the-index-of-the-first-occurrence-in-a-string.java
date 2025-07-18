class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;

        for(int i =0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0) && fun(i,haystack,needle)){
                return i;


            }
        }
        return -1;

        
    }
    static boolean fun(int i,String a,String b){
        int j =0; 
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)!=b.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return j==b.length();
    }
}