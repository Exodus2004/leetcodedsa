class Solution {
    public int possibleStringCount(String s) {
        int n = s.length();

         int count = 1;
         for(int i =1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)) count++;

         }

         return count;
        
    }
}