class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0;
        int r = nums.size()-1;
        int count = 0;
        for(int i =0;i<=r;i++){
            for(int j = i+1;j<=r;j++){
                if(nums.get(i)+nums.get(j)<target) count++;
            }
        }
        return count;
        
    }
}