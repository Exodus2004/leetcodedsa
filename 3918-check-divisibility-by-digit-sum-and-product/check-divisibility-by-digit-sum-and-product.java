class Solution {
    public boolean checkDivisibility(int n) {
        String s = Integer.toString(n);
        int sum =0;
        int pro = 1;
        for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        sum +=(int)(c-'0');
        pro*=(int)(c-'0');

        }
        return n%(sum+pro)==0;
        
    }

}