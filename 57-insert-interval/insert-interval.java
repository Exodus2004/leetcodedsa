class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Map<Integer,Integer> map = new HashMap<>();
        int a[][] = new int[intervals.length+1][2];
        int k = 0;
         for(int i[]:intervals){
            a[k][0 ] = i[0];
            a[k][1] = i[1];
            k++;
         }
         a[a.length-1][0] = newInterval[0];
         a[a.length-1][1] = newInterval[1];
         Arrays.sort(a,(c,b)->{return c[0]-b[0];});

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
        int x =0;
        for(int i :map.keySet()){
            b[x][0] = i;
            b[x][1] = map.get(i);
            x++;
        }
        Arrays.sort(b,(q,y)->{return q[0]-y[0];});
        return b;


        
    }
}