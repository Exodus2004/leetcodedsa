class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st =new Stack<>();

        for(String i:operations){
           if (!i.equals("C") && !i.equals("D") && !i.equals("+")){
                st.push(i);
            }
            else if(i.equals("C")) st.pop();

            else if(i.equals("D")){
                int val = Integer.parseInt(st.peek());
                st.push(String.valueOf(2*val));
            }
            else{
                int first = Integer.parseInt(st.peek());
                int second = Integer.parseInt(st.get(st.size()-2));
                st.push(String.valueOf(first+second));
            }
            
        }
        int sum = 0;
        while(!st.isEmpty()) sum+=Integer.parseInt(st.pop());
        return sum;
        
    }
}