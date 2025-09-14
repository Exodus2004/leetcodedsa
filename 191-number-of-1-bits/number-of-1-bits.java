class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        for(char ch:s.toCharArray()){
            if(ch=='1') c++;
        }
        return c;
        
    }
}