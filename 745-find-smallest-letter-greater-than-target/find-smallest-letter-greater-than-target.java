class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(target==letters[mid]){
                l = mid+1; 
                

            }
            else if(letters[mid]<target) {
                l = mid+1;

            }
            else {
                r = mid-1;

            }
        }
        return l>=letters.length?letters[0]:letters[l];
        
    }
}