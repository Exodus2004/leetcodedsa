class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        
        for(int i:nums)set.add(i);
        List<Integer> l = new ArrayList<>(set);
        if(l.get(l.size()-1)<0) return l.get(l.size()-1);
        System.out.println(l);
        int sum =0;
        int max = 0;
        
        
        for(int i=set.size()-1;i>=0;i--){
            sum = sum+l.get(i);
            max = Math.max(sum,max);

        }
        return max;

        
    }
}