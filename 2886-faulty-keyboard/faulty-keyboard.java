class Solution {
    public String finalString(String s) {
        char ch[] = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++) l.add(ch[i]);
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='i'){
                if(sb.length()!=0) sb.reverse();

            }
            else{
                sb.append(c);
            }


        }
        return sb.toString();

        
    }
     
}