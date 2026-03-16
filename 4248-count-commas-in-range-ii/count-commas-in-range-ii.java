class Solution {
    public long countCommas(long n) {
        long x = 1000;
        long c = 0;
        while(n>=x){
            c+=(n-x+1);
            x = x*1000;        
        }
        return c;
        
        
    }
}