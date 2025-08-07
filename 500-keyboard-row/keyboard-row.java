class Solution {
    public String[] findWords(String[] words) {
        Set<Character> seta = new HashSet<>();
        Set<Character> setb = new HashSet<>();
        Set<Character> setc = new HashSet<>();
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        for(char f:a.toCharArray()) seta.add(f);
        for(char f:b.toCharArray()) setb.add(f);
        for(char f:c.toCharArray()) setc.add(f);
        List <String> res = new ArrayList<>();

        for(String p:words){
            int counta =0;
                int countb =0;
                int countc = 0;
            for(int i = 0;i<p.length();i++){
                char x = Character.toLowerCase(p.charAt(i));
                
                

                if(seta.contains(x)) counta++;
                else if(setb.contains(x)) countb++;
                else if(setc.contains(x)) countc++;

                if(counta==p.length()||countb==p.length()||countc==p.length()) res.add(p);

            }

        }
        String m[] = new String[res.size()];
        res.toArray(m);
        return m;

        
    }
    
}