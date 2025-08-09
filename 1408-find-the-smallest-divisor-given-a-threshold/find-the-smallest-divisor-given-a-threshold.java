class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int l = 1;
        int r = nums[0];
        for(int x:nums){
            if(x>r) r = x;
        }

        while(l<=r){
            int m = (l+r)/2;

            if(fun(nums,m)<=threshold){
                r = m-1;

            }
            else if(fun(nums,m)>threshold) l =m+1;
            else r = m-1;
        }
        return l;



        
    }
    int fun(int a[],int val){
    int sum = 0;
        for(int i=0;i<a.length;i++){
            sum +=(int)Math.ceil((float)a[i]/val);
        }
        return sum;
    }
}