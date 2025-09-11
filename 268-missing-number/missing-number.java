class Solution {
    public int missingNumber(int[] a) {
        int sum = 0;
        for(int i :a) sum+=i;
        int n = a.length;
        return ((n*(n+1))/2)-sum;
    }
}