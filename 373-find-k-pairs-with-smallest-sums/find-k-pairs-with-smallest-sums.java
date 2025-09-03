class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            int x = nums1[a[0]]+nums2[a[1]];
            int y = nums1[b[0]]+nums2[b[1]];
            return x-y;
        });
        List<List<Integer>> res = new ArrayList<>();
        
        Set<List<Integer>> set = new HashSet<>();
        pq.add(new int[]{0,0});
        while(!pq.isEmpty() && res.size()<k){
            int x[] = pq.poll();
            res.add(Arrays.asList(nums1[x[0]],nums2[x[1]]));
            if(x[1]+1<nums2.length){
            List<Integer> next = Arrays.asList(x[0],x[1]+1);
            if(!set.contains(next)){

            set.add(next);
            pq.add(new int[]{x[0],x[1]+1});
            }


            }

            if(x[0]+1<nums1.length){
            List<Integer> next = Arrays.asList(x[0]+1,x[1]);
            if(!set.contains(next)){
            set.add(next);
            pq.add(new int[]{x[0]+1,x[1]});
            }


            }
            
           


        }
        
        return res;

        
    }
}