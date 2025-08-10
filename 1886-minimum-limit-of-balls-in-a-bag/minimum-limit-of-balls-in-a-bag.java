class Solution {
    boolean ispossible(int a[],int max,int val){
        int count = 0;
        int huge=0;

        for(int i =0;i<a.length;i++){
            if(val<a[i]){
                int x = a[i]/val;
                if(a[i]%val!=0) x++;

                max-=x-1;
                if(max<0) return false;


                
            
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = 0;
        for(int i:nums){
            if(i>r) r = i;
        }

        while(l<=r){
            int mid = l+(r-l)/2;

            if(ispossible(nums,maxOperations,mid)) r = mid-1;

            else if(!ispossible(nums,maxOperations,mid)) l = mid+1;

            else r = mid-1;
        }

        return l;

        
    }

}