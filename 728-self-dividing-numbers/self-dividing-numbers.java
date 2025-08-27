class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(fun(i)) res.add(i);
        }
        return res;
        
    }
    boolean fun(int x){
        if(x<9) return true;
        

        String s = String.valueOf(x);
        for(char c:s.toCharArray()){
            if(c=='0') return false;
            if(x%(int)(c-'0')!=0) return false;
        }
        return true;
    }
}