class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :arr) map.put(i,map.getOrDefault(i,0)+1);

        
        List<Integer> values = new ArrayList<>(map.values());
        Set<Integer> valuesSet = new HashSet<>(values);

        return values.size()==valuesSet.size();

        
    }
}