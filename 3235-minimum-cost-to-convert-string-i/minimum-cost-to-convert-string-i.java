class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long mcost[][] = new long[26][26];

        for(long c[]:mcost) Arrays.fill(c,Integer.MAX_VALUE);
        int n = original.length;

        for(int i = 0;i<n;i++){
            int s = original[i]-'a';
            int t = changed[i]-'a';

            mcost[s][t] = Math.min(mcost[s][t],cost[i]);

        }

    for(int k = 0;k<26;k++){
        for(int i = 0;i<26;i++){
            for(int j = 0;j<26;j++){
                if(mcost[i][k]!=Integer.MAX_VALUE && mcost[k][j]!=Integer.MAX_VALUE)
                   mcost[i][j] = Math.min(mcost[i][j],mcost[i][k]+ mcost[k][j]);
    
            }
        }
    }
        long res = 0;
       


        for(int i = 0;i<source.length();i++){
            char s = source.charAt(i);
            char t = target.charAt(i);

            if(s==t) continue;
            if(mcost[s-'a'][t-'a']==Integer.MAX_VALUE) return -1;
            res+=mcost[s-'a'][t-'a'];

        }
        return res;



        

        
    }
}