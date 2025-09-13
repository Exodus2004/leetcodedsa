class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            
             if(c==')' && !st.isEmpty() && st.peek()=='(') st.pop();
            else if(c=='}' && !st.isEmpty() && st.peek()=='{' ) st.pop();
            else if(c==']' && !st.isEmpty() && st.peek()=='[') st.pop();
            else{
                 st.push(c);
            }
        }
        return st.isEmpty();
        
    }
}