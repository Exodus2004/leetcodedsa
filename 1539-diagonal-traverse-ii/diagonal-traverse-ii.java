class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> list= new ArrayList<>();
      Map<Integer,List<Integer>> map = new TreeMap<>();

        for(int i=nums.size()-1;i>=0;i--){
            for(int j = 0;j<nums.get(i).size();j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(nums.get(i).get(j));
            }
        }
        
        for(int i:map.keySet()){
            for(int j:map.get(i)) list.add(j);
        }
        
        int a[] = new int[list.size()];
        for(int i =0;i<list.size();i++) a[i] = list.get(i);
        return a;
        
    }
}