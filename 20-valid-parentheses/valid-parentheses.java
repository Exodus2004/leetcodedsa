class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray()){
            if(c==')' && st.size()!=0 && st.peek()=='(') st.pop();
            else if(c=='}' &&st.size()!=0 && st.peek()=='{') st.pop();
            else if(c==']' && st.size()!=0 && st.peek()=='[') st.pop();

            else st.push(c);
            

        }
        return st.isEmpty();

        
    }
}