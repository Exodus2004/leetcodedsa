class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);

        while(s.length()!=32) s ='0'+s;

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        int x = Integer.parseInt(sb.toString(),2);
        return x;
        
    }
}