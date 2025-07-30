class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int x[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                int count = check(board,i,j);
                if(board[i][j]==1){
                    if(count<2) x[i][j] = 0;
                else if(count==2 || count==3 ) x[i][j] = 1;
                else if(count>3) x[i][j] = 0;

                }
                else{
                    if(check(board,i,j)==3) x[i][j] = 1;

                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = x[i][j];

            }
        }

        
    }
    static int check(int a[][],int i,int j){
        int n = a.length;
        int m = a[0].length;
        int nx[] = {0,0,-1,1,-1,1,-1,1};
        int ny[] = {1,-1,0,0,1,-1,-1,1};
        int count =0;
        for(int k=0;k<8;k++){
            int nr = i+nx[k];
            int nc =j+ny[k];
            if(nr<n && nc<m && nr>=0 && nc>=0 && a[nr][nc]==1) count++;  

        }
        return count;


        
    }
}