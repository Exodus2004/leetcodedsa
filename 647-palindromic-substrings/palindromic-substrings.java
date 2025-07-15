class Solution {
    public int countSubstrings(String s) {
        if(s.length()==0) return 0;
        int ans  =0;


        for(int i=0;i<s.length();i++){
            ans+=fun(s,i,i)+fun(s,i,i+1);
            

        }
        return ans;
        
    }
    static int fun(String s,int i,int j){
        if(i>=s.length() || i<0 || j>=s.length() || j<0) return 0;

        if(s.charAt(i)==s.charAt(j)){
            return 1+fun(s,i-1,j+1);
        }
        else return 0;



    }
}