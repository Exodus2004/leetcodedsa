class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int a[] =new int[nums.length];
        int n = nums.length;
        a[0] = nums[0];
        for(int i=1;i<nums.length;i++) a[i] = a[i-1]+nums[i];
        System.out.println(Arrays.toString(a));
        Map<Integer,Integer> prefix  = new HashMap<>();
        prefix.put(0,-1);
        for(int i=0;i<n;i++){
            int mod = a[i]%k;
            if(prefix.containsKey(mod)){
                if(i-prefix.get(mod)>=2) return true;

            }
            else prefix.put(mod,i);
        }
        
        
        
        
        return 0!=0;

        
    }
}