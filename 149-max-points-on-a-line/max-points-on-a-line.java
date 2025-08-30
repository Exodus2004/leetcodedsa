class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1) return 1;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i[]:points){
            list1.add(i[0]);
            list2.add(i[1]);
        }
        
        
        int max = 0;
        
        for(int i = 0;i<list1.size();i++){
            Map<String,Integer> map = new HashMap<>();
            for(int j = 0;j<list2.size();j++){
                if(i!=j){
                int count = 0;
                int x1 = list1.get(i);
                int y1 = list2.get(i);
                int x2 = list1.get(j);
                int y2 = list2.get(j);
                

                int dx = x2-x1;
                int dy = y2-y1;
                
                int g = gcd(dx,dy);
                String val = dx/g+" "+dy/g;
                map.put(val,map.getOrDefault(val,0)+1);

            }
            for (int freq : map.values()) {
            max = Math.max(max, freq + 1); 
            }

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