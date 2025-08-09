class Solution {
    boolean fun(int[] a, int m, int k, int val) {
    int count = 0;
    for(int i :a){
        if(i<=val){
            count++;
            if(count==k){
                m--;
                count = 0;
            }

            
        }
        else {
            count=0;
        }
    }
    return m<=0;
        
       
    

    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k) return -1;
        int l = 1;
        int r = bloomDay[0];
        for(int i:bloomDay){
            if(i>r) r = i;
        }
        System.out.println(l);
        System.out.println(fun(bloomDay,m,k,6));


        while(l<=r){
            int mid = l+(r-l)/2;
            if(fun(bloomDay,m,k,mid)) r = mid-1;

            else if(!fun(bloomDay,m,k,mid)) l = mid+1;
            else r = mid-1;

        }
        return l;

        
    }

}