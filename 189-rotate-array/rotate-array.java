class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i: nums) res.add(i);
        if(k!=0){
            k = k%res.size();
            Collections.rotate(res,k);
        }
        for(int i = 0;i<res.size();i++){
            nums[i] = res.get(i);
        }
        
    }
}