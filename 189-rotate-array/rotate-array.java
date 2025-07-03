class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
        
    }

    public void swap(int a[],int i,int j){

        while(i<=j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;

        }
    }
}