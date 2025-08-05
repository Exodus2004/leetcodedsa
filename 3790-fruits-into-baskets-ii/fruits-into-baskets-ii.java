class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        
        int count = 0;
        List<Integer>l = new ArrayList<>();
        for(int i :baskets) l.add(i);
        

        for(int i =0;i<n;i++){
            boolean f =false;
            
            for(int j = 0;j<l.size();j++){
                
                if(fruits[i]<=l.get(j)){
                    f = true;
                    l.remove(j);
                    

                    break;


                }
                

            }

            if(!f) count++;
            
           

        }
        return count++;
    }
}