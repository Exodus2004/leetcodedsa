class Solution {
    public String winningPlayer(int x, int y) {
        int count =0;
        while(true){
            if(x<1 ||y<4) break;
            x = x-1;
            y = y-4;
            count++;
            
        }
        
        return count%2==0?"Bob":"Alice"; 
    }
}