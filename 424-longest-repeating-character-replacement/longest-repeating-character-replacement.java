class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int a[] = new int[26];
        while(r<s.length()){
            a[s.charAt(r)-'A']++;
            int max = 0;
            for(int i :a) max = Math.max(max,i);

            while((r-l+1)-max>k){
                a[s.charAt(l++)-'A']--;

            }
            count = Math.max(count,r-l+1);
            r++;

            

        }
        return count;
    }
}