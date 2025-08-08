class Solution {
    public String convert(String s, int numRows) {
        char c[] = s.toCharArray();
        List<List<Character>> res= new ArrayList<>();
        StringBuilder sb = new StringBuilder( );
        for(int i =0;i<numRows;i++) res.add(new ArrayList<>());
        boolean flag = true;
        int k = 0;

        while(k<s.length()){

            for(int i = 0;i<numRows && k<s.length();i++) res.get(i).add(c[k++]);

            for(int i  = numRows-2 ; i>=1 && k<s.length();i--) res.get(i).add(c[k++]);
        }

       
            
            

        
        for(List<Character> i:res){
            for(char a:i) sb.append(a);
        }
        return sb.toString();


        
    }
}