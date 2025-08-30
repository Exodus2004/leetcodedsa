class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(char i[]:board){
            HashSet<Character> row = new HashSet<>();;

            for(char j:i){
                if(j!='.' && row.contains(j)){
                    
                    return false;

                }
                row.add(j);
            }
        }
        for(int i= 0;i<9;i++){
            HashSet<Character> col = new HashSet<>();;

            for(int k =0;k<9;k++){
                char j = board[k][i];
                if(j!='.' && col.contains(j)){
                    
                    return false;

                }
                col.add(j);
            }
        }
        for(int i = 0;i<9;i++){
            int startrow = (i/3)*3;
            int startcol = (i%3)*3;
            Set<Character> set = new HashSet<>();

            for(int x = 0;x<3;x++){
                for(int y= 0;y<3;y++){
                    int r = startrow+x;
                    int c = startcol+y;
                    if(board[r][c]=='.') continue;
                        
                    else if(set.contains(board[r][c]))return false;
                    
                    set.add(board[r][c]);

                }
            }

        }
        return true;

        
    }
}