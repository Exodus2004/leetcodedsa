class Solution {
    public int countSubstrings(String s) {
        int count =0;

        for(int i= 0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                if(palin(s.substring(i,j+1))) count++;
            }
        }
        return count;
        
    }
    static boolean palin(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}