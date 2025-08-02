class Solution {
    public char findTheDifference(String s, String t) {
        int a[] = new int[26];

        for(int i =0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            a[t.charAt(i)-'a']--;
        }
        System.out.println(Arrays.toString(a));
        for(int i =0;i<26;i++){
            if(a[i]<0) return (char)(i+'a');
        }

        return 'a';
        
    }
}