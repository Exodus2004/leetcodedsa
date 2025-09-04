class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(candidates);
        fun(0,0,target,candidates,temp,res);
        
        List<List<Integer>> k =new ArrayList<>(res);
        return k;
        
    }
    void fun(int i,int sum ,int target,int a[],List<Integer> temp,Set<List<Integer>> res){
        if(sum>target) return;
        if(i>=a.length){
            if(sum==target){
                res.add(new ArrayList<>(temp));
            }

            return;
        }
        
        
        sum+=a[i];
        temp.add(a[i]);
        fun(i+1,sum,target,a,temp,res);
        //after this call we have found all the valid combinations with a[i]

        sum-=a[i];
        temp.remove(temp.size()-1);
        //now we remove the a[i];

        // now we our combiations should not contain the a[i] again
        //since the array is sorted we will use while loop and increment the index until
        // we see a new element other than a[i];

        int next = i+1;
        while(next<a.length && a[next]==a[i]) next++;
        
        fun(next,sum,target,a,temp,res);
    }
}