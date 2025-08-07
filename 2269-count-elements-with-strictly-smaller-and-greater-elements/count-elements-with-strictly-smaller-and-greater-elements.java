class Solution {
    public int countElements(int[] a) {
        Arrays.sort(a);
        int p = Integer.MIN_VALUE;
        int l = 0;
        int co =0;
        
        for(int i = 1;i<a.length-1;i++){
            if(a[i]>a[0] && a[i]<a[a.length-1]){
                co++;
                


            }
        }
        return co;
        
    }
}