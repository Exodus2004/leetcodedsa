class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        Set<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');
        Set<Character> con = new HashSet<>();
        for(int i =0;i<26;i++){
            char c = (char)(i+'a');
            char x = (char)(i+'A');
            if(!vow.contains(c)) con.add((char)(i+'a'));
            if(!vow.contains(x)) con.add((char)(i+'A'));

        }
        boolean co = false;
        boolean v = false;
        for(char c:vow){
            if(word.contains(String.valueOf(c))) v = true;
        }
        if(!v) return false;
        for(char c:con){
            if(word.contains(String.valueOf(c))) co = true;
        }
        if(!co) return false;
        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
        }
        return true;

        
    }
}