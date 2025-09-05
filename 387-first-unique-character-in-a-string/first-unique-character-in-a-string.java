class Solution {
    public int firstUniqChar(String s) {
        int a[] =new int[26];
        for(char c:s.toCharArray()) a[(int)c-'a']++;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(a[c-'a']==1) return i;
        }
        return -1;

        
    }
}