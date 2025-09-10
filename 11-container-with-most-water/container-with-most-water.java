class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l<r){
            int area = Math.min(height[l],height[r])*(r-l);
            max = Math.max(max,area);
            int min = Math.min(height[l],height[r]);
            while(l<r && height[l]<=min) l++;
            while(l<r && height[r]<=min) r--;

        }
        return max;
        
    }
}