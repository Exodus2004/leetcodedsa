class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        List<String> res =new ArrayList<>();
        int l = 0;
        int r = 0;


        while(r<s.length()){
            sb.append(s.charAt(r));
            System.out.println(sb.toString());
            if(sb.length()==10){
                map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);

                sb.deleteCharAt(0);
                


            }

            r++;


        }
        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(e.getValue()>1) res.add(e.getKey());
        }
        return res;
        
    }
}