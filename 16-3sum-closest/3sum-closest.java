class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int n = nums.length;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
     return Math.abs(a-target)-Math.abs(b-target);
    });

    for(int i =0;i<n-2;i++){
        int l = i+1;
        int r = n-1;
        while(l<r){
            int sum = nums[l]+nums[i]+nums[r];
            pq.add(sum);
            if(sum>target) r--;
            else l++;
        }
    }
    return pq.poll();
        
    }
}