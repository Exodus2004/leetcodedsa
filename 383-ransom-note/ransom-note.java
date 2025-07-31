class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map.get('a'));
        System.out.println(map.get('b'));

        for(int i =0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!map.containsKey(c)) return false;
            int val = map.get(c);
            val = val-1;
            if(val<0) return false;
            map.put(c,val);
        }
        return true;

        
    }
}