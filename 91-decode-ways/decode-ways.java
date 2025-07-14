class Solution {
    public int numDecodings(String s) {
        Integer dp[] =new Integer[s.length()+1];

        
       

        return fun(s,0,s.length(),dp);
        
    }
    static int fun(String s,int i,int n,Integer dp[]){
        if(i>=n ) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=null) return dp[i];


        

        int c1 = fun(s,i+1,n,dp);
        int c2 = 0;

        if(i+1<n){
            int num = Integer.parseInt(s.substring(i,i+2));

            if(num>=10 && num<=26) c2 = fun(s,i+2,n,dp);
        }


        return dp[i] = c1+c2;

    }
}