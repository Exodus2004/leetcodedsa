class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        char p[] = sb.reverse().toString().toCharArray();
        for(int i=0;i<p.length;i++){
            s[i] = p[i];
        }
        
    }
}