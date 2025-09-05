class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        fun(0,nums,used,temp,res);
        List<List<Integer>> k= new ArrayList<>(res);
        return k;
        

    }
    void fun(int i,int a[],boolean used[],List<Integer> temp,Set<List<Integer>> res){
        if(temp.size()==a.length){
            res.add(new ArrayList<>(temp));
        }
        for(int j=0;j<a.length;j++){
            if(!used[j]){
                used[j] = true;
                temp.add(a[j]);
                fun(j,a,used,temp,res);
                used[j] = false;
                temp.remove(temp.size()-1);
            }

        }
    }
}