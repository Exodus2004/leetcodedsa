class Solution {
    public int divide(int dividend, int divisor) {
       
        
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
       
        int k= (int)(dividend/divisor);

        if(k>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(k<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return k;

        
        
    }
}