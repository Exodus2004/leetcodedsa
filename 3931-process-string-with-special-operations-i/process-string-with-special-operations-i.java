class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);

            if(Character.isLetter(c)) sb.append(c);


            else if(sb!=null && c=='*' && sb.length()>0) sb.deleteCharAt(sb.length()-1);

            else if(c=='#'){
                String ssb = sb.toString();
                for(int j =0;j<ssb.length();j++) sb.append(ssb.charAt(j));
            }

            else sb.reverse();
    
        }
        return sb.toString();
        
    }
}