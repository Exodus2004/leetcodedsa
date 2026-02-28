class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
        int sum = 0;
        int x = 1;
        for(int i = sb.length()-1;i>=0;i--){
            char c = sb.charAt(i);
            if(c=='1'){
                sum = (sum+x)% 1000000007;
                
            }

            x = (x*2) % 1000000007;
        }
        return sum;
        
    }
}