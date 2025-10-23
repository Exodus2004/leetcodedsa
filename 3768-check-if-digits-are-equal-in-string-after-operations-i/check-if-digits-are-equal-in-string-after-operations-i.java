class Solution {
    public boolean hasSameDigits(String s) {
        String p = s;
        StringBuilder sb  = new StringBuilder(s);
        StringBuilder pb  = new StringBuilder(s);
        while(pb.length()!=2){
            String res = pb.toString();
            pb=fun(res);
            res = pb.toString();
        }
        return pb.charAt(0)==pb.charAt(1);
        
    }
    StringBuilder fun(String s){
        int x = 0;
        int y = x+1;
        StringBuilder nsb = new StringBuilder();
        while(y<s.length()){
            int digit = ((s.charAt(x)-'0') + (s.charAt(y)-'0'))%10;
            nsb.append(String.valueOf(digit));
            x++;
            y++;
        
        }
        return nsb;


    }
}