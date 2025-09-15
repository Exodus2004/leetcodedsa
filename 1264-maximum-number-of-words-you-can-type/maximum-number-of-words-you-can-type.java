class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String a[]=text.split(" ");
        int c = a.length;
        System.out.println(c);
        System.out.println(Arrays.toString(a));
        for(String s:a){
            for(char ch:brokenLetters.toCharArray()){
                if(s.contains(String.valueOf(ch))){
                    c--;
                break;
                }
            }
        }
        return c;
        
    }
}