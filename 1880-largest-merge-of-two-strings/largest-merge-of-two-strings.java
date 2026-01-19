class Solution {
    public String largestMerge(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
         while(i<n && j<m){
            if(s.substring(i,n).compareTo(t.substring(j,m))>0) sb.append(s.charAt(i++));
             else sb.append(t.charAt(j++));
            

        }
        System.out.println("hello".compareTo("world"));
        while(i<n) sb.append(s.charAt(i++));
        while(j<m) sb.append(t.charAt(j++));
        return sb.toString();
        

        
    }
}