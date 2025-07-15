class Solution {
    public int minDistance(String word1, String word2) {
        Integer dp[][] = new Integer[word1.length()][word2.length()];
        return fun(0,word1,0,word2,dp);
        
    }
    static int fun(int i,String s,int j,String p,Integer dp[][]){
        if(i>=s.length()||j>=p.length()) return Math.max(s.length()-i,p.length()-j);

        if(dp[i][j]!=null) return dp[i][j];

        if(s.charAt(i)==p.charAt(j)) return fun(i+1,s,j+1,p,dp);

        int c1 = 1+fun(i+1,s,j,p,dp);
        int c2 = 1+fun(i,s,j+1,p,dp);
        int c3 = 1+fun(i+1,s,j+1,p,dp);

        return dp[i][j] =Math.min(c1,Math.min(c2,c3));


    }
}