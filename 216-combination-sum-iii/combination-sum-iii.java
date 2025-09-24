class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List< Integer> temp = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        for(int i=1;i<10;i++) val.add(i);
        fun(0,val,0,res,temp,k,n);
        return res;
        
    }
    void fun(int i,List<Integer> val,int sum,List<List<Integer>> res,List<Integer> temp,int k
    ,int n){
        if(i==val.size()){
            if(temp.size()==k && sum==n){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(val.get(i));
        sum=sum+val.get(i);
        fun(i+1,val,sum,res,temp,k,n);
        temp.remove(temp.size()-1);
        sum=sum-val.get(i);
        fun(i+1,val,sum,res,temp,k,n);
    }
}