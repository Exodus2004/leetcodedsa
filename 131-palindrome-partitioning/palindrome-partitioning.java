class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        fun(0,s,temp,res);
        return res;
        
    }
    void fun(int i,String s,List<String> temp,List<List<String>> res){

        if(i>=s.length()){
             res.add(new ArrayList<>(temp));
             return;
        }
        for(int j= i;j<s.length();j++){
            if(valid(s.substring(i,j+1))){
                temp.add(s.substring(i,j+1));
                fun(j+1,s,temp,res);
                temp.remove(temp.size()-1);

            }
        }
        
    }
    boolean valid(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}