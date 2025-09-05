class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
       List<Integer> temp =new ArrayList<>();
       List<List<Integer>> res = new ArrayList<>();
       boolean used[] =new boolean[nums.length];
       fun(0,nums,used,temp,res);
       return res;
    }
    void fun(int i,int a[],boolean used[],List<Integer> temp,List<List<Integer>> res){
        
        if(temp.size()==a.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        
       for(int j =0;j<a.length;j++){
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