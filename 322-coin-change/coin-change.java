class Solution {
    public int coinChange(int[] coins, int amount) {
        int d[] =new int[amount+1];
        Arrays.fill(d,amount+1);
        d[0] = 0;
        for(int i =1;i<=amount;i++){
            for(int c:coins){
             if(c<=i){
                d[i]= Math.min(d[i],d[i-c]+1);
             }
            }
        }
        return d[amount]>amount?-1:d[amount];

      

        
    }
}