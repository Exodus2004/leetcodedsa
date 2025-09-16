class Solution {
    public int trailingZeroes(int n) {
        return fun(n);
        
    }
    int fun(int n){
        int top = n;
        int sum =0;
        int k = 1;
        while(true){
            if((int)Math.pow(5,k)>n) break;
            int val = (int)Math.floor((float)n/(int)Math.pow(5,k));
            sum+=val;
            k++;
            
        }
        return sum;
    }
}