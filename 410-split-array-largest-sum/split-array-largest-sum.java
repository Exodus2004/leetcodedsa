class Solution {
    boolean ispossible(int a[],int k,int max){
        int sum =0;
        for(int i=0;i<a.length;i++){
            int val = a[i];
            if(val>max) return false;
            if(sum+val>max){
                k--;
                sum =0;
            }
            sum+=val;

            if(k<=0) return false;

        }
        return true;

    }
    public int splitArray(int[] nums, int k) {

        int l = 0;
        int r = (int)Math.pow(10,10);
        

        while(l<=r){
            int mid = l+(r-l)/2;

            if(ispossible(nums,k,mid)) r = mid-1;

            else if(!ispossible(nums,k,mid)) l =mid+1;
            else r = mid-1;

        }
        return l;


        

        
    }
}