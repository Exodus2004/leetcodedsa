class Solution {
    public int minPartitions(String n) {
        int max  = 0;
        String s = String.valueOf(n);
        for(int i =0;i<s.length();i++){
            max = Math.max(max,(int)(s.charAt(i)-'0'));
        }
        return max;

        
        
    }
}