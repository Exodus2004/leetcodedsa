class Solution {
    public int[] getNoZeroIntegers(int n) {
        int k =1;
        for(int i=n-1;i>=0;i--){
            String s = String.valueOf(i);
            String p = String.valueOf(k);
            if(!s.contains(String.valueOf(0)) && !p.contains(String.valueOf(0))) return new int[]{i,k};

            k++;


        }
        return new int[]{};
        
    }
}