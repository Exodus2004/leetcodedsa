class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r  = 0;
        int n = nums.length;
        int res[]= new int[n-k+1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        while(r<n){
            pq.add(new int[]{nums[r],r});
            while(r-l+1>k){
                l++;
                while(pq.peek()[1]<l) pq.poll();



            }
            if(r-l+1==k) res[l] = pq.peek()[0];
            r++;
        }
        return res;
    }
}