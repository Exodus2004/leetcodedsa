class Solution {
    public List<String> validStrings(int n) {
        List<String> val = new ArrayList<>();
        int i =0;
        while(true){
            if(Integer.toBinaryString(i).length()>n) break;
            val.add(fun2(Integer.toBinaryString(i),n));
            i++;
        }
        List<String> res = new ArrayList<>();
        for(String s:val){
            if(fun(s)) res.add(s);
        }
        return res;
        

    }
    String fun2(String s,int n){
        while(s.length()<n){
            s='0'+s;
        }
        return s;
    }
    boolean fun(String s){
        
        for(int i=0;i<s.length()-1 ;i++){
            if(!s.substring(i,i+2).contains(String.valueOf(1))) return false;
        }

        return true;
        


    }
}