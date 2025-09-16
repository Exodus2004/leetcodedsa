class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        for(int i :map.keySet()){
            if(map.get(i)>1) pairs++;
        }
        

        if(k==0) return pairs;
        List<Integer> val = new ArrayList<>(set);

        Collections.sort(val);
        for(int i =0;i<val.size();i++){
            
            for(int j =i+1;j<val.size();j++){
                if( val.get(j)-val.get(i)==k){
                    
                    count++;
                }
            }
        }
        return count;
        
    }
}