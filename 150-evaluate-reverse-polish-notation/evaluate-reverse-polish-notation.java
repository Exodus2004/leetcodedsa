class Solution {
    public int evalRPN(String[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<n;i++){
            if(!a[i].equals("+")&&!a[i].equals("-")&&!a[i].equals("/")&&!a[i].equals("*")){
                s.push(Integer.parseInt(a[i]));
            }
            else{
                int x = s.pop();
                int b = s.pop();
                if(a[i].equals("*")) s.push(x*b);
                else if(a[i].equals("+")) s.push(x+b);
                else if(a[i].equals("/")) s.push(b/x);
                else s.push(b-x);

            }
            
            
        }
        return s.pop();
        
    }
}