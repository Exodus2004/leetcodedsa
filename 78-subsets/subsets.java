class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        fun(0,nums,set,res);

       
        return res;

        
        
    }
    void fun(int i,int nums[],List<Integer> set, List<List<Integer>> res){
        if(i>=nums.length){
            res.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        fun(i+1,nums,set,res);
        set.remove(set.size()-1);
        fun(i+1,nums,set,res);
    }
}