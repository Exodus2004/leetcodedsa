class Solution {
    public int minChanges(String s) {
        int count =0;
        List<String> res= new ArrayList<>();
        
        int n = s.length();
        for(int i =0;i<n;i=i+2){
            if(i+2<=n){
                res.add(s.substring(i,i+2));

                count+=fun(s.substring(i,i+2));

            }
        }
        
        return count;

        
    }
    int fun(String s){
        if(s.charAt(0)!=s.charAt(1)) return 1;
        else return 0;

    }
}