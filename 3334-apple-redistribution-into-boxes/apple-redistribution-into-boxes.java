class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = capacity.length;
        Integer []a = new Integer[capacity.length];
        for(int i = 0;i<n;i++) a[i] = capacity[i];
        Arrays.sort(a,(x,b)->{
            return b-x;

        });
        int sum = 0;
        for(int i : apple) sum+=i;

        int c =0;
        while(sum>0){
            sum = sum-a[c];
            c++;

        }
        return c;
        
    }
}