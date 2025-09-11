class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(intervals,(a,b)->{return a[0]-b[0];});
        int count = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i =1;i<n;i++){
            if(end>intervals[i][0]){
                count++;
                end = Math.min(end,intervals[i][1]);
            }

            else{
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        return count;
        
    }
}