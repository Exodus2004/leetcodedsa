class Solution {
    public boolean judgeCircle(String moves) {
        int verticalsum=0;
        int horizontalsum =0;
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c=='U'){
                verticalsum++;


            }
            else if(c=='D'){
                verticalsum--;


            }
            else if(c=='R'){
                horizontalsum++;

            }
            else horizontalsum--;
        }
        return verticalsum==0 && horizontalsum==0; 
        
    }
}