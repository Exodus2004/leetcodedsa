class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put(String.valueOf('I'),1);
        map.put(String.valueOf('V'),5);
        map.put(String.valueOf('X'),10);
        map.put(String.valueOf('L'),50);
        map.put(String.valueOf('C'),100);
        map.put(String.valueOf('D'),500);
        map.put(String.valueOf('M'),1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int sum = 0;

        int l = 0;
        while(l<s.length()){
            if(l!=s.length()-1 && map.containsKey(""+s.charAt(l)+s.charAt(l+1))){
                StringBuilder sb = new StringBuilder(""+s.charAt(l)+s.charAt(l+1));
                sum+=map.get(sb.toString());
                l =l+2;

            }
            else{
                StringBuilder sb = new StringBuilder(""+s.charAt(l));
                sum+=map.get(sb.toString());
                l++;

            }
        }
        return sum;
    }
}