class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;

        int max = 0;

        while(i<j){

            int x = Math.min(height[i],height[j]) * Math.abs(i-j);
            max = Math.max(x,max);

            if(height[i]<height[j]) i++;

            else j--;

            
            
            

            



                

            




        }
        return max;
        
    }
}