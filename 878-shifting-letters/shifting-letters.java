class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;

        StringBuilder sb = new StringBuilder(s);

        int a[] = new int[n];
        a[n-1] = shifts[n-1];
        for(int i = n-2;i>=0;i--){
            a[i] = (a[i+1]+shifts[i])%26;
        }
        for(int i = 0;i<n;i++){
            char ch = (char)((s.charAt(i)-'a'+a[i])%26+'a');
            sb.append(ch);
        }
        

        

        return sb.substring(n,2*n);
    }

}