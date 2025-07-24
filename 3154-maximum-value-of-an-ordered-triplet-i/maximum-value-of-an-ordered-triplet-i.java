class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long max = Long.MIN_VALUE;
        int n = nums.length;
        
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                
                for(int k =j+1;k<n;k++){
                    
                   
                        long val = (long)(nums[i]-nums[j])*nums[k];
                        max = Math.max(max,val);
                    
                }
            }
        }
        return max<=0?0:max;

        
        
    }
}