class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
             map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==j) return i;
        }
         throw null;
        
    }
}