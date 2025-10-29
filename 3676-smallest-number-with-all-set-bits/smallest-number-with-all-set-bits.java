class Solution {
    public int smallestNumber(int n) {
        for(int i = n;i<2000;i++){
            if(!Integer.toBinaryString(i).contains("0")) return i;
        }
        return 0;

        
    }
    
}