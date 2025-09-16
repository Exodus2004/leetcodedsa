class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       int n = 100001;

       for(int i :nums){
        set.add(i);
       }
       for(int i=1;i<=n;i++) if(!set.contains(i)) return i;

       return -1;

        
    }
}