class Solution {
    public int longestSubarray(int[] nums, int limit) {

        int l =0;
        int r = 0;
        int max = 0;
        TreeMap<Integer,Integer> map = new TreeMap();

        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            

            while(Math.abs(map.lastEntry().getKey()-map.firstEntry().getKey())>limit){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;

            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;

        
    }
    
        
    
}