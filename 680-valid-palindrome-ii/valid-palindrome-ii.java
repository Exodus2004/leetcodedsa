class Solution {
    public boolean validPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        int c = 0;
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a!=b){
                boolean x = fun(s,i);
                boolean y = fun(s,j);
                return x|y;
            }
            else if(a==b) {
                i++;
                j--;

            }
            
            
        }
        return true;
        
    }
    boolean fun(String s,int i){
        String p = new StringBuilder(s).deleteCharAt(i).toString();

        int l =0;
        int j =p.length()-1;
        while(l<j){
            if(p.charAt(l)!=p.charAt(j)) return false;
            l++;
            j--;
        }
        return true;

    }
}