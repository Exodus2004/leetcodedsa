class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        int x = s.length();
        for(int i=0;i<x-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;
        
    }
}