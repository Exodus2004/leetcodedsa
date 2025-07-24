class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<26;i++){
            map.put((char)(i+'a'),map.getOrDefault((char)(i+'a'),0)+1);
        }

       for(int i=0;i<sentence.length();i++){
        char c = sentence.charAt(i);
        map.put(c,map.get(c)-1);
       }
       for(int i :map.values()){
        if(i>0) return false;
       }
       return true;
        
    }
}