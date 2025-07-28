class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int a[] = new int[n+1];
        for(int i[]:trust){
            a[i[0]]--;
            a[i[1]]++;
        }
        for(int i = 0;i<=n;i++){
            if(a[i]==n-1) return i;
        }
        return -1;
        
    }
}