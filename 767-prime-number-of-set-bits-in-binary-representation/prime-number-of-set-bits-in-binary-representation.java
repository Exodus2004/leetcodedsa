class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i =left;i<=right;i++){
            if(prime(Integer.bitCount(i))) c++;

        }
        return c;
        
    }
    boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
         if (n % 2 == 0) return false;
        for(int i = 3;i*i<=n;i=i+2){
            if(n%i==0) return false;
        }
        return true;
    }
}