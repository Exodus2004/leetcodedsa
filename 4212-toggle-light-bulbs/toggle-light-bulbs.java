class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new TreeSet<>();
        int n = bulbs.size();

        for(int i = 0;i<n;i++){
            if(set.contains(bulbs.get(i))) set.remove(bulbs.get(i));
            else set.add(bulbs.get(i));

        }

        return new ArrayList<>(set);

        
    }
}