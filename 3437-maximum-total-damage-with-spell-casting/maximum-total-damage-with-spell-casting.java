class Solution {
    public long maximumTotalDamage(int [] power) {
        
        Map<Long,Long> map = new HashMap<>();

        for(int i :power) map.put((long)i,map.getOrDefault((long)i,0L)+(long)i);

        List<Long> l = new ArrayList<>(map.keySet());
        System.out.println(l);

        Collections.sort(l);
        Long dp[] = new Long[l.size()+1];

        return fun(l,0,map,dp);
        
    }
    static long fun(List<Long> l,int i,Map<Long,Long> map,Long dp[]){
        if(i>=l.size()) return 0;
        if(dp[i]!=null) return dp[i];

        long curnum = l.get(i);

        long curindexvalue = map.get(l.get(i));

        int nextIndex = i+1;

        while(nextIndex<l.size() && (l.get(nextIndex)==curnum+1 ||
        l.get(nextIndex)==curnum+2)){
            nextIndex++;
        }

        long take = curindexvalue+fun(l,nextIndex,map,dp);
        long skip = fun(l,i+1,map,dp);

        return dp[i]=Math.max(take,skip);
    }
}