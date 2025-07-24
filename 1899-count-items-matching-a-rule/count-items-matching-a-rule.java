class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count  =0;
        for(List<String>l:items){
            if(ruleKey.equals("type")){
                if(l.get(0).equals(ruleValue)) count++;

            }
            else if(ruleKey.equals("color")){
              if(l.get(1).equals(ruleValue)) count++;


            }
            else{
            if(l.get(2).equals(ruleValue)) count++;


            }
        }
        return count;
        
    }
}