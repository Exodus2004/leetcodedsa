class Solution {
    public double myPow(double x, int n) {
       if(n<0){
            return 1/fun(x,n);
        }
        else return fun(x,n);
        

        
    }
    public static double fun(double x,int n ){
            if( n==0) return 1;
              double y= x*x;
            if(n%2==0) return fun(y,n/2);
            else return x*fun(y,n/2);
        }
}