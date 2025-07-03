class Solution {
    public int distributeCandies(int[] a) {
        int n = a.length;
        int typesofchoco = 1;
        Arrays.sort(a);
        for(int i =1;i<n;i++){
            if(a[i]!=a[i-1]) typesofchoco++;

        }

        int reduced = n/2;
       if(typesofchoco>=reduced) return reduced;
       else return typesofchoco;
        
    }

    public static int fun(int a,int b){

        return (fact(a)/(fact(a-b)*fact(b)));

    }
    public static int fact(int n){
        if(n==0||n==1) return 1;
        return fact(n-1)*n;
    }
}