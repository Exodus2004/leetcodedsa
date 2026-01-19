class Solution {
    public long minimumSteps(String s) {
        int i = 0;
        int j = s.length()-1;
        long c = 0;

        while(i<j && i<s.length()){
            if(s.charAt(i)=='0'){
                i++;
                continue;

            }
            while(j>=0 && s.charAt(j)!='0') j--;


            if(j>i){
                c+=(j-i);
                j--;
                i++;

            }

        }
        return c;

        
        
        
        
    }
}