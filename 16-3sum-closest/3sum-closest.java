class Solution {
    public int threeSumClosest(int[] nums, int target) {
      
        int n = nums.length;
        int r = 0;
        int prevdiff = Integer.MAX_VALUE;


        Arrays.sort(nums);

        for(int i =0;i<n;i++){
            int k = i+1;
            int j = n-1;
            while(k<j){

                int sum = nums[i]+nums[k]+nums[j];
                int diff =Math.abs(sum - target);

               
               

                if(sum<target) k++;
                else j--;
                 if(diff<prevdiff){
                    r = sum;
                    prevdiff = diff;
                }
                
                


            }
        }
       
     return r;
        
        
    }
}