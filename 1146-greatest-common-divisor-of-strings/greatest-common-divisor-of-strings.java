class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals("") || str2.equals("")) return "";
        StringBuilder sb1= new StringBuilder(str1+str2);
        StringBuilder sb2= new StringBuilder(str2+str1);
        if(!sb1.toString().equals(sb2.toString())) return "";
        
        StringBuilder sb = new StringBuilder();
        int n =gcd(str1.length(),str2.length());
        return str2.substring(0,n);
        

        
        
    }
    int gcd (int a,int b){
        while(a!=b){
            if(a>b) a =a-b;
            else b =b-a;
        }
        return a;
    }
}