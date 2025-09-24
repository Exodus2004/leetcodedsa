class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> value = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=1;i<=n;i++) value.add(i);
        List<List<Integer>> res = new ArrayList<>();
        fun(0,value,res,temp,k);
        return res;
        
    }
    void fun(int i,List<Integer> value,List<List<Integer>> res,List<Integer> temp,int k){
        if(i==value.size()){
            if(temp.size()==k) res.add(new ArrayList<>(temp));

            return;
        }
        temp.add(value.get(i));
        fun(i+1,value, res,temp,k);
        temp.remove(temp.size()-1);
        fun(i+1,value,res,temp,k);
    }
}