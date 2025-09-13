class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = n;
        List<String> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(valid(s,i,j)) count++;
            }
        }
        
        return count;
        
    }
    boolean valid(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}