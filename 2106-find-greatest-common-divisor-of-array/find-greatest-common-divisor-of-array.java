class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return fun(nums[0],nums[nums.length-1]);
        
    }
    int fun(int a,int b){
        while(a!=b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;

    }
    
}