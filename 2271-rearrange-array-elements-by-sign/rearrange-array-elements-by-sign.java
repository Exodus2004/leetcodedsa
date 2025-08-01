class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg= new ArrayList<>();
        for(int i:nums){
            if(i<0) neg.add(i);
            else pos.add(i);
        }
        boolean f = true;
        for(int i=0;i<nums.length;i++){
            if(f){
                nums[i] = pos.get(i/2);
                f = !f;
            }
            else{
                nums[i] = neg.get(i/2);
                f = !f;
            }
        }
        return nums;
        
    }
}