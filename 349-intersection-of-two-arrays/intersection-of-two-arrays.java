class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int val =nums1[i];
            for(int j =0;j<nums2.length;j++){
                if(val==nums2[j]){
                    if(!list.contains(val)) list.add(val);
                }
            }
        }
        int a[] = new int[list.size()];
        for(int i=0;i<list.size();i++) a[i] = list.get(i);
        return a;
        
    }
}