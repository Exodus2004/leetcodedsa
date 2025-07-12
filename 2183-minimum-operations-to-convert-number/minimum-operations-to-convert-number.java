class Solution {
    class pair{
        int num;
        int count;
        pair(int num,int count){
            this.num = num;
            this.count = count;
        }
    }
    public int minimumOperations(int[] nums, int start, int goal) {

        int n = nums.length;

        Set<Integer> visited = new HashSet<>();

        Queue<pair> q = new LinkedList<>();

        q.add(new pair(start,0));


        while(!q.isEmpty()){
            pair p = q.poll();
            int present = p.num;
            int count = p.count;
            int newnum = 0;

            if(present==goal) return count;

            for(int i =0;i<n;i++){
                newnum = present+nums[i];
                if(newnum>=0 && newnum<=1000|| newnum == goal){
                    if(!visited.contains(newnum)){
                    visited.add(newnum);
                    q.add(new pair(newnum ,count+1));
                }
                }
                
                newnum = present-nums[i];

                if(newnum>=0 && newnum<=1000|| newnum == goal){
                    if(!visited.contains(newnum)){
                    visited.add(newnum);
                    q.add(new pair(newnum ,count+1));
                }
                }
                
                newnum = present^nums[i];
                if(newnum>=0 && newnum<=1000|| newnum == goal){
                    if(!visited.contains(newnum)){
                    visited.add(newnum);
                    q.add(new pair(newnum ,count+1));
                }
                }

                
            }
        }
        return -1;


                
    }
}