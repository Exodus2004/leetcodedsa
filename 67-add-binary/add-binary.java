class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int car =0;
        StringBuilder sb = new StringBuilder();

        while(i>=0||j>=0){
            int sum = car;
           if(i>=0) sum +=a.charAt(i)-'0';
            i--;
            if(j>=0)sum +=b.charAt(j)-'0';
            j--;
            
            sb.append(sum%2);
            car = sum/2;


        }
        if(car!=0) sb.append(car);
        return sb.reverse().toString();
        
    }
}