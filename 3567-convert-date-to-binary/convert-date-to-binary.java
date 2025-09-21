class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0,4))));
        sb.append('-');
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(5,7))));
        sb.append('-');
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(8,10))));
        return sb.toString();
        
    }
}