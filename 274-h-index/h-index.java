class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int max = 1;

        for(int i =0;i<n;i++){
            if(citations[i]>=n-i){
                return n-i;
                
            }
        }
        return 0;
        
    }
}