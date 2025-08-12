class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int l = 0;
        int res = 0;
        int r = 0;
        while(r<s.length()){
            char c = s.charAt(r);
            if(check(c)) count++;
            

            while(r-l+1>k){
                if(check(s.charAt(l))) count--;
                l++;

            }
            res = Math.max(res,count);

            r++;
        }
        return res;
        
    }
    boolean check(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;

        return false;
    }
}