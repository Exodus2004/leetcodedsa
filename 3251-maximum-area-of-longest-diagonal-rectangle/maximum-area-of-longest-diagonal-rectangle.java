class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        int maxd = 0;
        
        for(int i[]:dimensions){
            int area = i[0]*i[1];
            int d = i[0]*i[0]+i[1]*i[1];
            if(maxd<d){
                maxd = d;
                max = area;
            }
            else if(maxd==d){
                max = Math.max(max,area);
            }


        }
        return max;
        
    }
}