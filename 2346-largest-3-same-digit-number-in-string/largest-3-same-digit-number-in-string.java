class Solution {
    public String largestGoodInteger(String s) {
        List<String> set = new ArrayList<>();
        
        
        for(int i=0;i<s.length()-3+1;i++){
            char c = s.charAt(i);
            if(s.charAt(i+1)==c && s.charAt(i+2)==c){
                set.add(s.substring(i,i+3));
            }
        }
        return set.size()==0?"":Collections.max(set);


        
    }
}