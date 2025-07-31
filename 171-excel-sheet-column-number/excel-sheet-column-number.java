class Solution {
    public int titleToNumber(String columnTitle) {
        int sum  =0;
        int n = columnTitle.length();

        for(int i=0;i<n;i++){
            sum *=26;
            sum +=(int)columnTitle.charAt(i)-'A'+1;
        }
        return sum;

        
        
    }
}