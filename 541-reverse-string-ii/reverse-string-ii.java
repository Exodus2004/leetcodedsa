class Solution {
    public String reverseStr(String s, int k) {
        char c[] = s.toCharArray();
        int i=0;
        int j = 0;
        System.out.println(s.length());
        if(k>=s.length())return new StringBuilder(s).reverse().toString();
        

        while(i<s.length()){
            int end = Math.min(i+k-1,s.length()-1);
            fun(c,i,end);
            j =i;
            i=i+2*k;
            

        }
        System.out.println(j);
        return new String(c);
        
    }
    void fun(char c[],int i,int j){
        while(i<j){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
    }
}