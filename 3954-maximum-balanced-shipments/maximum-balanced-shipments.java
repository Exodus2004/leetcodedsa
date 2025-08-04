class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int c  = 0;
        int l  =0;
        for(int i :weight){
            if(i<l){
                c++;
                l =0;
            }
            else{
                l = i;
            }

        }
        return c;
        
    }
}