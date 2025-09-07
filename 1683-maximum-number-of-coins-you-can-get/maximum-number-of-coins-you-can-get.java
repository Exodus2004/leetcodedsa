class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int start =  n-((2*n)/3);
        int sum =0;
        for(int i =start;i<n;i=i+2){
            sum+=piles[i];
        }
        return sum;
    }
}