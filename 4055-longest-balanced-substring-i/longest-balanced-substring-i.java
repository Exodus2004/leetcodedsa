class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;
        for(int i =0;i<n;i++){
          Map<Character,Integer> map = new HashMap<>();
          for(int j = i;j< n;j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(fun(map)) max = Math.max(max,j-i+1);
          }


        }
        return max;
        


        
    }
    boolean fun(Map<Character,Integer> map){
        Set<Integer> set = new HashSet<>();
        for(int i:map.values()) set.add(i);

        return set.size()==1;
    }
}