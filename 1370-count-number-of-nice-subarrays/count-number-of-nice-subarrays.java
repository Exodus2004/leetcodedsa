class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int a = atmost(nums,k);
        int b = atmost(nums,k-1);
        return a-b;
        

       
        

        
    }
    int atmost(int a[],int k){
        int n = a.length;
        int count = 0;
        int l = 0;
        int r = 0;
        int ans = 0;
        int max = 0;
        while(r<n){
            if(a[r]%2!=0){
                count++;
            }

            while(count>k){
                if(a[l]%2!=0) count--;

                l++;
                
            }
            ans +=r-l+1; 
            
            r++;

        }
        return ans;
    }
    
}