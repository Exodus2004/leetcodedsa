class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(fun(s.charAt(i))) sb.append(s.charAt(i));

        }
        sb.reverse();
        int k =0;
        for(int i =0;i<s.length();i++){
            if(fun(s.charAt(i))){
                res.append(sb.charAt(k));
                k++;

            }
            else{
                res.append(s.charAt(i));
            }

        }
        return res.toString();
        
    }
    boolean fun(char c){
        
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        
        return false;
    }
}