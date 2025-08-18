class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\s+");
        int left= 0;
        int right = a.length-1;

        while(left<right){
            String x = a[left];
            a[left] = a[right];
            a[right] = x;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<a.length;i++){
            
            sb.append(a[i]+" ");

        }
        return sb.toString().trim();

        

        
    }
}