class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;

        int i = 0;
        StringBuilder sb = new StringBuilder();
    
        while(i<n){
            int count = 0;
            char curr = chars[i];

            while(i< n && chars[i]==curr){
                count++;
                i++;
            }
            sb.append(curr);
            if(count>1) sb.append(count);
            
        }
        char c[] =  sb.toString().toCharArray();
        for(int x = 0;x<c.length;x++){
            chars[x] = c[x];
        }
        return sb.length();
        
    }
}