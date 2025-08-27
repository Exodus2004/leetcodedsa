class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(fun(i)) res.add(i);
        }
        return res;
        
    }
    boolean fun(int x){
        if(String.valueOf(x).contains(String.valueOf(0))) return false;

        int val =x;

        while(val>0){
            int l = val%10;
            if(x%l!=0) return false;
            val = val/10;
        } 
        return true;
    }
}