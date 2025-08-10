class Solution {
    public boolean reorderedPowerOf2(int n) {

        Set <String> res = new HashSet<>();
        for(int i=0;i<31;i++){
            int val = (int)Math.pow(2,i);
            char c[]= String.valueOf(val).toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            res.add(sorted);
            
            
        }

        String given = String.valueOf(n);
        char c[] = given.toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);
        return res.contains(sorted);

        
    }
}