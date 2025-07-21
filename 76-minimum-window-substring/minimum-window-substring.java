class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> required = new HashMap<>();
        for(int i=0;i<t.length();i++) required.put(t.charAt(i),required.getOrDefault(t.charAt(i),0)+1);

        Map<Character,Integer> window = new HashMap<>();
        int start = -1;
        int minlen = Integer.MAX_VALUE;
        int left = 0;
        int formed = 0;

        for(int right = 0;right<s.length();right++){
            char current = s.charAt(right);
            window.put(current,window.getOrDefault(current,0)+1);

            if(required.containsKey(current) && window.get(current).equals(required.get(current))) formed++;

            while(formed==required.size() && left <=right){
                if(minlen>right-left+1){
                    minlen = right-left+1;
                    start = left;
                }

                char curleft = s.charAt(left);

                window.put(curleft,window.get(curleft)-1);

                if(required.containsKey(curleft) && window.get(curleft)<required.get(curleft)) formed--;




                left++;


            }


        }
        return start ==-1?"":s.substring(start,start+minlen);
      

        
        
    }
}