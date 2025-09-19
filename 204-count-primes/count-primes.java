class Solution {
    public int countPrimes(int n) {
        if(n==0) return 0;
        if(n==1) return 0;
        int count = 0;
        boolean a[] = new boolean[n+1];
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;
        for(int i=0;i*i<n;i++){
            if(prime(i)){
                for(int j = i*i;j<n;j=j+i){
                    a[j] = false;
                }

            }
        }
        for(int i=0;i<n;i++) if(a[i]) count++;
        return count;
      
        
    }
    boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

}