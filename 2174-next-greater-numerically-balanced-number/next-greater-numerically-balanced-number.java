class Solution {
    public int nextBeautifulNumber(int n) {
        int x = n+1;
        System.out.println(fun("3133"));
        while(true){
            if(fun(String.valueOf(x)) && !String.valueOf(x).contains("0")) break;
            x++;
        }
        return x;
        

    }
    boolean fun(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
    

        for(char c: map.keySet()){
            if(c!='0' && (int)(c-'0')!=map.get(c)) return false;
        }

        return true;
    }
}