class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        int max = 0;
        int nmax = 0;
        for(char ch:map.keySet()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            max = Math.max(max,map.get(ch));
        }
        else{
            nmax = Math.max(nmax,map.get(ch));

        }

        }
        return max+nmax;
    }
}