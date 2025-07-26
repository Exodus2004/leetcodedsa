class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int intiallaser = 0;
        int count =0;
        int laser = 0;
       
        int prev = 0;

        for(int i =0;i<bank[0].length();i++) if(bank[0].charAt(i)=='1') intiallaser++;
        
        for(int i =0;i<n;i++){
            laser = 0;
            for(int j=0;j<bank[i].length();j++){
                
                
                if(bank[i].charAt(j)=='1') laser++;


            }
            if(laser!=0){
            
                count +=prev*laser;
                prev = laser;
            

            }
            
            


        
            

        }
        return count;
        
    }
}