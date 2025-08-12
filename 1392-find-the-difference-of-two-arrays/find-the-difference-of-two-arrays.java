class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> seta = new HashSet<>();
        Set<Integer> setb = new HashSet<>();
        Set<Integer> resa = new HashSet<>();
        Set<Integer> resb = new HashSet<>();

        for(int i:nums1) seta.add(i);
        for(int i:nums2) setb.add(i);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i:nums1){
            if(!setb.contains(i)) resa.add(i);
        }
        for(int i:nums2){
            if(!seta.contains(i)) resb.add(i);
        }
        res.add(new ArrayList<>(resa));
        res.add(new ArrayList<>(resb));
        return res;
        
        
    }
}