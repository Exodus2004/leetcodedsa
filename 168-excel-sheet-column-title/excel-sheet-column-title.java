class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            n = n-1;
            sb.append((char)(n%26+'A'));
            n = n/26;

        }
        return sb.reverse().toString();

        

        

        
    }
}