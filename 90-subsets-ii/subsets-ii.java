class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,temp,res);
        return res;
        
    }
    void fun(int i,int a[],List<Integer> temp,List<List<Integer>> res){
        if(i>=a.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(a[i]);
        fun(i+1,a,temp,res);
        temp.remove(temp.size()-1);
        int next = i+1;
        while(next<a.length && a[next]==a[i])next++;
        fun(next,a,temp,res);
    }
}