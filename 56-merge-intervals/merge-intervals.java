class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a,(c,b)->{return c[0]-b[0];});
        Map<Integer,Integer> map = new HashMap<>();
        if(a.length==1) return a;
        int start = a[0][0];
        int end = a[0][1];
        for(int i=1;i<a.length;i++){
            if(end>=a[i][0]) end = Math.max(end,a[i][1]);
            else{
                map.put(start,end);
                start = a[i][0];
                end = a[i][1];
            }
        }  
        map.put(start,end);  

    
        
        int b[][] = new int[map.size()][2];
        int k =0;
        for(int i:map.keySet()){
            b[k][0] = i;
            b[k][1] = map.get(i);
            k++;
        }

        return b;


    
        
    }
}