class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#' && st1.size()!=0) st1.pop();
            else if(c!='#') st1.push(c);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#' && st2.size()!=0) st2.pop();
            else if(c!='#')  st2.push(c);
        }
        System.out.println(st1);
        System.out.println(st2);
        return st1.equals(st2);


        
    }
}