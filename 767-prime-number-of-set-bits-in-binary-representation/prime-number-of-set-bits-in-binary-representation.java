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
        for(int i = 2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}