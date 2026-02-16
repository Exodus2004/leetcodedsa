class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> fmap = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);

        
        for(int i:map.values()){
            fmap.put(i,fmap.getOrDefault(i,0)+1);
        }
        System.out.println(fmap);

        for(int i:nums){
            if(fmap.get(map.get(i))==1) return i;
        }
        return -1;

        
    }
}