class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        fun(0,nums,used,temp,res);
       
        return res;
        

    }
    void fun(int i,int a[],boolean used[],List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==a.length){
            res.add(new ArrayList<>(temp));
        }
        for(int j=0;j<a.length;j++){
            if(!used[j]){


                if(j!=0 && a[j-1]==a[j] && !used[j-1]) continue;
                used[j] = true;
                temp.add(a[j]);
                fun(j,a,used,temp,res);
                
                used[j] = false;
                temp.remove(temp.size()-1);
                
            }

        }
    }
}