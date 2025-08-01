class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i=2;i<=n-2;i++){
            String p = fun(n,i);
            if(!valid(p)) return false;
        }
        return true;


        
    }
    boolean valid(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static String fun(int n,int i){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int val = n%i;
            sb.append(val);
            n = n/i;
        } 
        return sb.reverse().toString();
    }

}