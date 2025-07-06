class Solution {
    public int trap(int[] a) {
        int n = a.length;

        int x[] = new int[n];
        int y[] = new int[n];

        x[0] = a[0];

        for(int i =1;i<n;i++){
            x[i] = Math.max(x[i-1],a[i]);

        }
        y[n-1] = a[n-1];
        for(int i = n-2;i>=0;i--){
            y[i] = Math.max(y[i+1],a[i]);
        }
       

        int total = 0;

        for(int i =0;i<n;i++){
            int left = x[i];
            int right = y[i];
            if(a[i]<left && a[i]<right){
                total+=Math.min(left,right)-a[i];
            }
        }
        return total;


    }
}