class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[2*n];
        int k = 0;
        for(int i=0;i<2*n;i=i+2){
            a[i] = nums[k];
            k++;
        }
                for(int i =1;i<2*n;i=i+2){
            a[i] = nums[k];
            k++;
        }
        return a;

        
    }
}