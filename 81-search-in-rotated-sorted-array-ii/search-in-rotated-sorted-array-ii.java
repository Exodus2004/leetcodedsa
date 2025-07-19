class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if(n==1 && nums[0]==target) return true;

        int l = 0;
        int r = n-1;

        while(l<=r){
            int m = (l+r)/2;
            System.out.println(m);
            if(nums[m]==target) return true;

            if(nums[l]==nums[m] && nums[m]==nums[r]){
                l++;
                r--;
            }
           

            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && target<=nums[m]){
                    r = m-1;
                    
                }
                
                else {
                    l = m+1;
                   
                }

            }
            

            else{

               if(nums[m]<=target && target<=nums[r]){
                l = m+1;
                

               } 
                else {
                    r = m-1;
                    


                }
                
            }
            


        }
        return false;
        
    }
}