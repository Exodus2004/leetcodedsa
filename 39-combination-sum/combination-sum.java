class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        fun(0,0,target,candidates,temp,res);
        return res;
    }
    void fun(int i,int sum,int target,int a[],List<Integer> temp,List<List<Integer>> res){
        if(sum> target) return;
        if(i>=a.length){
            if(sum==target){
                res.add(new ArrayList<>(temp));
                
            }
            return;
        }
        sum+=a[i];
        temp.add(a[i]);
        fun(i,sum,target,a,temp,res);
        sum-=a[i];
        temp.remove(temp.size()-1);
        fun(i+1,sum,target,a,temp,res);
    }
}