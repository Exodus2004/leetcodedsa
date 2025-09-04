class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        fun(0,0,a,target,temp,res);
        return res;

        
    }
    void fun(int i,int sum,int a[],int target,List<Integer> temp,List<List<Integer>> res){
        if(sum>target) return;
        if(i>=a.length){
            if(sum==target){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        sum+=a[i];
        temp.add(a[i]);
        fun(i,sum,a,target,temp,res);
        sum-=a[i];
        temp.remove(temp.size()-1);
        fun(i+1,sum,a,target,temp,res);

    }
}