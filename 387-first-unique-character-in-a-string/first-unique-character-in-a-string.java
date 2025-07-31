class Solution {
    public int firstUniqChar(String s) {
        int a[] = new int[26];

        for(int i =0;i<s.length();i++){
            a[(int)(s.charAt(i)-'a')]++;
        }
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(a[(int)(c-'a')]==1) return i;
        }
        return -1;

        

        
    }
}