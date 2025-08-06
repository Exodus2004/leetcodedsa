class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n  = arr.length;

        int l = 0;
        int r = 0;
        int sum =0;
        int count = 0;
        System.out.println(average(arr,0,2));
        while(r<n){
            
            
            if(r-l+1==k){
                if(average(arr,l,r)>=threshold) count++;
                
                l++;
            }
           
            r++;

        }
        return count;
        
    }
    int average(int a[],int i,int j){
        int sum = 0;
        for(int k =i;k<=j;k++) sum+=a[k];

        return sum/(j-i+1);
    }
}