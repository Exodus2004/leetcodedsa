class Solution {
    public int numWaterBottles(int n, int e) {
        int sum =n;
        int x = n;
        int drop = 0;
        while(true){
            sum=sum+ x/e;
            drop=x%e; 
            x=x/e+drop;
            if(x<e) break;
        }
        return sum;
        
    }
}