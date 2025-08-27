class Solution {
    public int findGCD(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max  =Integer.MIN_VALUE;
        for(int i:nums){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        return fun(min,max);
        
    }
    int fun(int a,int b){
        while(a!=b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;

    }
    
}