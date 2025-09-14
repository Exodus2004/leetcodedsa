class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i :nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> res = new ArrayList<>();
        for(int i :map.keySet()){
            if(map.get(i)>n/3) res.add(i);
        }
        return res;
    }
}