class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set set = new HashSet<>();
        for(int i : nums) set.add(i);

        for(int i = k;i<=1000;i=i+k) if(!set.contains(i)) return i;

        return 0;
        
    }
}