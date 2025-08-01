class Solution {
    public int maxDepth(String s) {
        int c =0;
        int m = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                m = Math.max(c,m);
            }
            else if(s.charAt(i)==')') c--;


        }
        return m;

        
    }
}