class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = s.length()-1;i>=0;i--){
            char c = sb.charAt(i);
            int digit = c-'0';
            if(digit%2==0) break;
            else sb.deleteCharAt(i);
        }
        return sb.toString();

    }
}