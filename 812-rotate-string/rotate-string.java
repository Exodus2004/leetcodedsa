class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;
        String x = goal+goal;

        if(x.contains(s)) return true;

        return false;
        
    }
}