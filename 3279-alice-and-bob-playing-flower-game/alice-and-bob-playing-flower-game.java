class Solution {
    public long flowerGame(int n, int m) {
        long count = 0;
        
        long ne1 = (long)Math.floor((float)(n/2));
        long no1 = n-ne1;
        long ne2 = (long)Math.floor((float)(m/2));
        long no2 = m-ne2;
        long a = ne1*no2;
        long b = no1*ne2;
        return a+b;

           
        
         
        
    }
}