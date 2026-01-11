class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
                if(fun(x,y,points[i][0],points[i][1])<res){

                
                res = fun(x,y,points[i][0],points[i][1]);
                ans = i;
                }

            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
    int fun(int x1,int y1,int x2,int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}