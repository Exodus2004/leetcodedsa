class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int start = 0;
        int last = 0;




        for(int i=0;i<n;i++){
            if(prime(nums[i])){
                start = i;
                break;
            }
        }
        for(int i =n-1;i>=0;i--){
            if(prime(nums[i])){
                last = i;
                break;
            }
        }

        return Math.abs(start-last);

        


        
    }
    public static boolean prime(int n){
        if(n<2) return false;
        if(n==2) return true;


        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}