class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums) map.put(i,map.getOrDefault(i,0)+1);
        int pairs = 0;
        int count = 0;
        for(int i:map.keySet()){
            if(map.get(i)>1) pairs++;

            if(map.containsKey(i+k)) count++;

        }
        return k==0?pairs:count;
        
    }
}