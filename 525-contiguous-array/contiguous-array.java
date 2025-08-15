class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0) nums[i] = -1;
        }
        
        map.put(0,-1);
        int sum = 0;
        int ax = 0;

        for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
            if(map.containsKey(sum)){
                ax = Math.max(ax,i-map.get(sum));

            }
          else map.put(sum,i);
          

        }
        return ax;
        
    }
}