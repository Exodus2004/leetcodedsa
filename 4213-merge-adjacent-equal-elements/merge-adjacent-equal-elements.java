class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        for(int i: nums){
            long c = (long)i;
            while(!st.isEmpty() && st.peek()==c){
                st.pop();
                c = 2*c;
            }
             st.push((long)c);
        }
        return new ArrayList<>(st);
    }
}