class Solution {
    public int largestRectangleArea(int[] heights) {
        int []pse = findpse(heights);
        int []nse = findnse(heights);
        int max = 0;
        for(int i =0;i<heights.length;i++){
            max = Math.max(max,heights[i]*(nse[i]-pse[i]-1));

        }
        return max;
        
    }
    int []findnse(int a[]){
        int b[] = new int[a.length];
        int k = 0;
        Stack<Integer> st = new Stack<>();
        for(int i =a.length-1;i>=0;i--){
            while(st.size()!=0 && a[st.peek()]>=a[i]) st.pop();
            if(st.isEmpty()) b[i]=a.length;
            else b[i] = st.peek();


            st.push(i);
        }
        return b;

    }
    int []findpse(int a[]){
        int b[] = new int[a.length];
        int k = 0;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<a.length;i++){
            while(st.size()!=0 && a[st.peek()]>=a[i]) st.pop();
            if(st.isEmpty()) b[i]=-1;
            else b[i] = st.peek();


            st.push(i);
        }
        return b;

    }
}