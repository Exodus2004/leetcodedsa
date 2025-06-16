class Solution {
    public int longestValidParentheses(String s) {
        int max1 =0,max2=0;
        int open =0;
        int close = 0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='(')open++;

            else close++;

            if(close==open) max2 =Math.max(max2, close+open);


            if(close>open){
                close = 0;
                open = 0;
            }
        }
        close = 0;
        open =0;
       

        for(int i =s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            if(c=='(')open++;

            else close++;

            if(close==open) max1 = Math.max(max1, close+open);


            if(close<open){
                close = 0;
                open = 0;
            }

        }

        return Math.max(max1,max2);

        
    }
}