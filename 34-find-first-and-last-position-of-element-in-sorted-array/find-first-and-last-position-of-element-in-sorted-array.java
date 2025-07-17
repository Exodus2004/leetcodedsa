class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = {-1,-1};
        a[0] = fun(nums,0,nums.length-1,target);
        a[1] = fun2(nums,0,nums.length-1,target);
      
      return a;
    }
    static int fun(int a[],int i,int j,int k){
        int idx = -1;
        while(i<=j){
            int m = (i+j)/2;
            if(a[m]==k){
                idx = m;
                j = m-1;
            }

            else if(a[m]<k) i = m+1; 
            else j = m-1;
        }
        return idx;
    }
    static int fun2(int a[],int i,int j,int k){
        int idx = -1;
        while(i<=j){
            int m = (i+j)/2;
            if(a[m]==k){
                idx = m;
                i = m+1;
            }

            else if(a[m]<k) i = m+1; 
            else j = m-1;
        }
        return idx;
    }
    
}