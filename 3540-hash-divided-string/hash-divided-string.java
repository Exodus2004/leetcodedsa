class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb= new StringBuilder();

        for(int i =0;i<s.length();i+=k){
            int sum =0;
            String v = s.substring(i,i+k);
            for(int j = 0;j<v.length();j++){
                sum+=v.charAt(j)-'a';
            }
            sum = sum%26;
         
            sb.append((char)(sum+'a'));
        }
        return sb.toString();


        
    }
    
}