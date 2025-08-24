class Solution {
    public int sumSubarrayMins(int[] arr) {
        int a[] = findpse(arr);
        int b[] = findnse(arr);
        
        long answer = 0;
        int n = arr.length;
        int x[] = new int[n];
        long mod = 1000000007;

        for(int i =0;i<arr.length;i++){
            
            answer += (long) (i - a[i]) * (b[i] - i) % mod * arr[i] % mod;
            answer %= mod;
            


        }
        
        
    

          return (int)answer; 
        
    }
    int[] findpse(int a[]){
        int n = a.length;
        int b[] =new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]>a[i]) st.pop();

            if(st.isEmpty()) b[i] = -1;
            else b[i] = st.peek();

            st.push(i);

        }
        return b;
    }
    int [] findnse(int a[]){
         
        int n = a.length;
        int b[] =new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && a[st.peek()]>=a[i]) st.pop();

            if(st.isEmpty()) b[i] = n;
            else b[i] = st.peek();

            st.push(i);

        }
        return b;
    }
    
}