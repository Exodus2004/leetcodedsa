class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i : nums) list.add(i);
        for(int i = 0;i<n;i++){
            int sum = nums[i];
            for(int j = i+1;j<n;j++){
                sum+=nums[j];
                list.add(sum);
                

            }
        }
        Collections.sort(list);
        int sum = 0;
        System.out.println(list);
        for(int i =left;i<=right;i++){
            sum+=list.get(i);
            sum=sum%1000000007;
        }
        
        return sum%1000000007;

        
    }
}