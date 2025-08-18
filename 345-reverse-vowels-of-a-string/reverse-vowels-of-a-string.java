class Solution {
    public String reverseVowels(String s) {
        int left =0;
        int right = s.length()-1;
        char a[] = s.toCharArray();

        while(left<right){

            while(left<right && fun(a[left])) left++;
            while(left<right && fun(a[right])) right--;

            char t = a[right];
            a[right] = a[left];
            a[left] = t;
            left++;
            right--;

        }
        return new String(a);

        
    }
    boolean fun(char c){
        return "aeiouAEIOU".indexOf(c)==-1;
    }
}