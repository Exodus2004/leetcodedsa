class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = 0;
        int min =Integer.MAX_VALUE;
        int secmin =Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min) min = i;
            else if(i<secmin && i>min) secmin = i;

            else if(i>secmin && i>min) return true;
        }
        System.out.println(min);
        System.out.println(secmin);
        return false;
        
    }
}