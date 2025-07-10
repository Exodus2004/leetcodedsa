class Solution {
    public int numDecodings(String s) {
        Integer dp[]= new Integer[s.length()+1];
        return fun(s,0,dp);
        
    }
    static int fun(String s,int i,Integer dp[]){
        if(i>=s.length()) return 1;// suceccesfully reaching the end  
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=null) return dp[i];

        int a = fun(s,i+1,dp);


        int b = 0;
        if(i+1<s.length()){
            int val = Integer.parseInt(s.substring(i,i+2));

            if(val>=10 && val<=26){
                b = fun(s,i+2,dp);
            }
        }
        return dp[i]=a+b;

        

        
    }
}