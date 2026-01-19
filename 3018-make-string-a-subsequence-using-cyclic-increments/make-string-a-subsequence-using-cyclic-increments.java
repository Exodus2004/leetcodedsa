class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m= t.length();
        while(i<n && j<m){
            if(s.charAt(i)-t.charAt(j)==-1 || (s.charAt(i)=='z' && t.charAt(j)=='a')| (s.charAt(i)-t.charAt(j))==0){
                i++;
                j++;
            }
            else i++;

            

        }
        System.out.println(i);
        System.out.println(j);

        
        return j==m;
        


        
    }
}