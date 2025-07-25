class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen  = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                seen.addFirst(nums[i]);
                k =0;
            }


            else{
                k++;
                if(k-1<seen.size()) ans.add(seen.get(k-1));
                else ans.add(-1);
            }


        }
        return ans;
        
    }
}