class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Set<String> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i[]:logs){
            String s = i[0]+" "+i[1];
            if(!set.contains(s)){
                set.add(s);
                list.add(i);
            }
        }
        int[][] unique = list.toArray(new int[0][]);
        for(int i[]:unique) map.put(i[0],map.getOrDefault(i[0],0)+1);
        int a[] = new int[k];
        for(int i:map.values()){
            a[i-1]++;
        }
        return a;
        
    }
}