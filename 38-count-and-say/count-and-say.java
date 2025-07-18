class Solution {
    public String countAndSay(int n) {
        return fun(n);
        
    }
    static String fun(int n){
        if(n==1) return "1";

       


        String prev = fun(n-1);
         StringBuilder sb = new StringBuilder();

        char current = prev.charAt(0);
        int count=1;
        for(int i=1;i<prev.length();i++){
            if(prev.charAt(i)==current) count++;

            else{
                sb.append(count);
                sb.append(current);

                current = prev.charAt(i);
                count = 1;

            }
        }
        sb.append(count).append(current);
        return sb.toString();
    }
}