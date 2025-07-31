class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String x:a){
            sb.append(fun(x)+" ");
        }
        return sb.toString().trim();

        
    }
    String fun(String s){
        return new StringBuilder(s).reverse().toString();
    }
}