class Solution {
    public boolean containsDuplicate(int[] nums) {
        int a[] = new int[100000];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)) return true;
            map.put(i,0);
        }
        return false;
        
    }
}