class StockSpanner {
    Stack<int[]> st;
    int index;

    public StockSpanner() {
        st = new Stack<>();
     index = 0;
        
    }
    
    public int next(int price) {
        int val =0;
        while(!st.isEmpty() && st.peek()[0]<=price) st.pop();

        if(st.isEmpty()) val = index+1;
        else val = index-st.peek()[1];

        st.push(new int[]{price,index});
        index++;

        return val;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */