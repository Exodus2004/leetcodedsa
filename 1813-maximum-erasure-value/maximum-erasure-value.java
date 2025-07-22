class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum =0;
        int left = 0;
        int right = 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;

        while(right<nums.length){
            sum +=nums[right];
            System.out.println(sum);
            
            
                
                
               
            
            
                while(set.contains(nums[right])){
                    set.remove(nums[left]);
                    sum = sum-nums[left];
                    
                    left++;

                }
                set.add(nums[right]);
                
                


            
             

            right++;
            max = Math.max(max,sum);

           

        }
        return max;
        
        
    }
}