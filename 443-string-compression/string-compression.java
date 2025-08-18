class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;

        int i = 0;
        while(i<n){
            int count = 0;
            char curr = chars[i];

            while(i< n && chars[i]==curr){
                count++;
                i++;
            }
            chars[write] = curr;
            write++;
            if(count>1){
                String p = String.valueOf(count);
                for(char c:p.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
        
    }
}