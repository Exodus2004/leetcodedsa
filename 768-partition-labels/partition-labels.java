class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
       
        int prev = -1;
        int max = 0;
        List<Integer> res = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            max = Math.max(max,map.get(s.charAt(i)));
            if(max==i){
                res.add(i-prev);
                prev =i;

            }

        }

        

        return res;
        
    }
}