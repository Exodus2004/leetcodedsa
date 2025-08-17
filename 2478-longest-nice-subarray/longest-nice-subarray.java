class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int r  =0;
        int max = 1;

        while(r<nums.length){
            
            while(!check(nums,l,r)){
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
        
    }
    boolean check(int a[],int i,int j){
        if(a.length==1) return true;
        
        for(int k = i;k<=j;k++){
            for(int h = k+1;h<=j;h++){
                
                if((a[k] & a[h])!=0) return false;
            }
        }
        return true;
    }
}