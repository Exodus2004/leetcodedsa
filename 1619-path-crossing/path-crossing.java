class Solution {
    
    
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        
        set.add(x+","+y);
       
        for(int i =0;i<path.length();i++){
            char c = path.charAt(i);
            System.out.println(set);
            if(c=='N'){
                y++;
                if(set.contains(x+","+y)) return true;
                else{
                set.add(x+","+y);

                }
            }
            else if(c=='S'){
                y--;
                if(set.contains(x+","+y)) return true;
                else{
                           set.add(x+","+y);

                }
            }
            else if(c=='E'){
                x++;
                if(set.contains(x+","+y)) return true;
                else{
                            set.add(x+","+y);

                }
            }
            else{
            x--;
                if(set.contains(x+","+y)) return true;
                else{
                           set.add(x+","+y);

                }

            } 
            
        }
        return false;
    }
}