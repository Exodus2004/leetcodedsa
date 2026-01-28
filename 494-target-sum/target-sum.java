class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(nums,0,target,0);
        
    }
    int fun(int a[],int sum, int target,int i){
        if(sum==target && i==a.length){
            return 1;
        }
        else if(i>=a.length) return 0;

        return fun(a,sum+a[i],target,i+1)+ fun(a,sum-a[i],target,i+1);
    }
}