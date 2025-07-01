class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        double max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<n-k+1;i++){
            sum =0;
            for(int j = i;j<i+k;j++){
                sum +=nums[j];

                
                
            }
            double presentaverage = (double)sum/k;

            max = Math.max(max,presentaverage);
            
        }
        return max;
        
    }
}