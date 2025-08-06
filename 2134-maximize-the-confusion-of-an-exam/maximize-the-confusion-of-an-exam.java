class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int n = answerKey.length();
        int countf = 0;
        int countt = 0;

        while(r<n){
            char c = answerKey.charAt(r);
            
            if(c=='T') countt++;
            else countf++;

            while(Math.min(countf,countt)>k){
                if(answerKey.charAt(l)=='T') countt--;
                else countf--;
                l++;

            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
        
    }
}