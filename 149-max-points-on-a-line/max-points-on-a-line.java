class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1) return 1;
        int max = 0;
        for(int i = 0;i<points.length;i++){
            Map<String,Integer> map = new HashMap<>();
            for(int j = 0;j<points.length;j++){
                if(i!=j){
                int count = 0;
                int dx = points[i][0]-points[j][0];
                int dy = points[i][1]-points[j][1];
                int g = gcd(dx,dy);
                String val = dx/g+" "+dy/g;
                map.put(val,map.getOrDefault(val,0)+1);
            }
            for (int freq : map.values()) max = Math.max(max, freq + 1); 
            

        }
    

        
    }
            return max;

    }

    int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}