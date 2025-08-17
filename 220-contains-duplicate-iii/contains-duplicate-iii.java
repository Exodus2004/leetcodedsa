class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int l =0;
        int r = 0;
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        while(r<n){
            while(r-l>indexDiff){
                set.remove(nums[l]);
                l++;
            }
            Integer pot = set.floor(nums[r]+valueDiff);
            if(pot!=null && pot>=nums[r]-valueDiff) return true;

            set.add(nums[r]);



            
            
            
            
            r++;
        }

        return false;
        
        
    }
    

    
}