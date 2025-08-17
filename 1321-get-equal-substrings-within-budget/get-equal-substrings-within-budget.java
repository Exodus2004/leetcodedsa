class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int r = 0;
        int max = 0;
        int sum =0 ;
        while(r<s.length()){
            int val = Math.abs(s.charAt(r)-t.charAt(r));
            sum+=val;

            while(sum>maxCost){
                sum-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
        
    }
}