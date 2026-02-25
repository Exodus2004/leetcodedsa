class Solution {
    public int[] sortByBits(int[] arr) {
        Integer x[] = new Integer[arr.length];
        for(int i=0;i<arr.length;i++) x[i] = arr[i];
        Arrays.sort(x,(a,b)->{
            int n =Integer.bitCount(a);
            int y =Integer.bitCount(b);
            if(n==y) return a-b;
            else return n-y;
        });
                for(int i=0;i<arr.length;i++) arr[i] = x[i];
                return arr;

        
        
    }
}