class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;

        for(int i =0;i<k;i++) sum += nums[i];
        double presentaverage = (double)sum/k;
        double average = presentaverage;



        for(int i =k;i<n;i++){

            sum = sum - nums[i-k] + nums[i];

            presentaverage =(double)sum/k;

            average = Math.max(average,presentaverage);
            presentaverage = average;
        } 

        return average;


    }
}