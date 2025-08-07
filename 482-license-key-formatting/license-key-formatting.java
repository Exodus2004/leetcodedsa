class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        StringBuilder sb  = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c=='-') continue;

            if(count==k){
                sb.append('-');
                count = 0;
            }
            
                sb.append(Character.toUpperCase(c));
                count++;
            


        }
        
        return sb.reverse().toString();
        
    }
}