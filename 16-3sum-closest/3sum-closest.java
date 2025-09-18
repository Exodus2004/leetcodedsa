class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int n = nums.length;
   
    int res =0;
    int diff = Integer.MAX_VALUE;

    for(int i =0;i<n-2;i++){
        int l = i+1;
        int r = n-1;
        while(l<r){
            int sum = nums[l]+nums[i]+nums[r];
            if(Math.abs(sum-target)<diff){
                diff = Math.abs(sum-target);
                res = sum;


            }
            if(sum>target) r--;
            else l++;
        }
    }
    return res;
        
    }
}