class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int i[]:accounts){
            int sum = 0;
            for(int k:i) sum+=k;

            max = Math.max(max,sum);
        }
        return max;
        
    }

}