class Solution {
    public int minimumBuckets(String hamsters) {
        int c =0;
        int ch =0;

        int n = hamsters.length();
        if(n==1 && hamsters.charAt(0)=='H') return -1;
        for(int i =0;i<hamsters.length();i++){
            if(hamsters.charAt(i)=='H'){
                if( i!=0 && i!=hamsters.length()-1 && hamsters.charAt(i-1)!='.' && hamsters.charAt(i+1)!='.') return -1;
                if(i==0 && hamsters.charAt(i+1)!='.') return -1;
                if(i==n-1 && hamsters.charAt(i-1)!='.') return -1;
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<hamsters.length();i++){
            if(hamsters.charAt(i)=='H'){
                if(set.contains(i-1) || set.contains(i+1)) continue;

                if(i!=0 && i!=n-1 && hamsters.charAt(i-1)=='.' && hamsters.charAt(i+1)=='.'){
                    set.add(i+1);
                }
                else if(i!=n-1 && hamsters.charAt(i+1)=='.') set.add(i+1);
                else if(i!=0 && hamsters.charAt(i-1)=='.') set.add(i-1);

            }
        }
        return set.size();
        
    }
}