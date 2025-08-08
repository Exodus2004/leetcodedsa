class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int i : nums) set.add(i);
        int val = set.size();
        int n = nums.length;

        int l =0;
        int r = 0;
        int count = 0;
        Map<Integer,Integer> win = new HashMap<>();
        for(int i =0;i<n;i++){
            Set<Integer> s= new HashSet<>();
            for(int j =i;j<n;j++){
                s.add(nums[j]);
                if(s.size()==val) count++;

            }
            
        }
        return count;
        
    }
}