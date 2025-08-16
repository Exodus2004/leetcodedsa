class Solution {
    public int maxDepth(String s) {
        int max =0;
        Stack<Character> st = new Stack<>();
        for(char i :s.toCharArray()){
            if( i=='(') st.push(i);
            else if(i==')') st.pop();
            max = Math.max(max,st.size());
        }
        return max;
        
    }
}