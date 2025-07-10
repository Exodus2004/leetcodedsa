class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i :nums) map.put(i,map.getOrDefault(i,0)+i);

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Integer dp[] = new Integer[list.size()+1];

        return fun(list,0,map,dp);


        
    }
    static int fun(List<Integer> l,int i,Map<Integer,Integer> map,Integer dp[]){
        if(i>=l.size()) return 0;
        if(dp[i]!=null) return dp[i];


        int currindexvalue = map.get(l.get(i));

        int nextIndex = i+1;
        while(nextIndex<l.size() && l.get(nextIndex) ==l.get(i)+1) nextIndex++; // skip presentvalue+1 numbers
        int take = currindexvalue+fun(l,nextIndex,map,dp);
        int skip = fun(l,i+1,map,dp);
        return dp[i]=Math.max(take,skip);
    
    
    }
}