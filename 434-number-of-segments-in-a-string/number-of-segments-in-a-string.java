class Solution {
    public int countSegments(String s) {
        // if(s.) return 0;
        int count = 0;
        String a[] = s.trim().split(" ");
        for(String p:a){
            if(p.isEmpty()) count++;
        }

        return a.length-count;
        
    }
}