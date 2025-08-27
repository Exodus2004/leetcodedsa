class Solution {
    public void nextPermutation(int[] nums) {
        boolean flag = true;
        int n = nums.length;
     int pivot = -1;
     for(int i =n-2;i>=0 ;i--){
        if(nums[i]<nums[i+1]){
            pivot = i;
            break;
        }

     }
     if(pivot==-1){
        Arrays.sort(nums);
        return;
     }
     int min = Integer.MAX_VALUE;
     int right =-1;
     for(int i = pivot+1;i<n;i++){
        if(nums[i]>nums[pivot] && nums[i]<min){
            min = nums[i];
            right = i;
        }
    }
    
        swap(nums,pivot,right);
        List<Integer> res = new ArrayList<>();

        for(int i = pivot+1;i<n;i++) res.add(nums[i]);
        Collections.sort(res);
        int k =0;
        for(int i =pivot+1;i<n;i++){
            nums[i] = res.get(k);
            k++;
        }
     System.out.println(right);

        
        
    }
    static void swap(int nums[],int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]= t;
    }
}