class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> set = new HashSet<>();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            
            if(c=='(') st.push(c);
            else if(c==')'){
                if(!st.isEmpty() && st.peek()=='(') st.pop();
                else if(st.isEmpty()) set.add(i);
            }
            else continue;
            

        }
        while(!st.isEmpty()) st.pop();
        
        for(int i = n-1;i>=0;i--){
            char c = s.charAt(i);
            
            if(c==')') st.push(c);
            else if(c=='('){
                if(!st.isEmpty() && st.peek()==')') st.pop();
                else if(st.isEmpty()) set.add(i);
            }
            else continue;

        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<n;i++){
            if(!set.contains(i)) sb.append(s.charAt(i));
        }
        

        return sb.toString();
        
    }
}