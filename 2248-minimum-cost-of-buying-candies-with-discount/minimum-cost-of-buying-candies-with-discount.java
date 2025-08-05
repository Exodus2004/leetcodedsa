class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        if(n==1) return cost[0];
        if(n==2) return cost[0]+cost[1];

        int sum = 0;
        for(int i =n-1;i>=0;i=i-3){
            sum+=cost[i];
            if(i-1>=0) sum+=cost[i-1];

        }
        return sum;
        
    }
}