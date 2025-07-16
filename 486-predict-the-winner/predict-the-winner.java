class Solution {
    int p1 = 0;
    int p2 = 0;
    public boolean predictTheWinner(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums) l.add(i);
        if(fun(l,0,l.size()-1)>=0) return true;
        else return false;
        
    }
    int fun(List<Integer> l,int start,int end){
        if( start==end) return l.get(start);

        int pickstarting = l.get(start)-fun(l,start+1,end);
        int pickending = l.get(end)-fun(l,start,end-1);

        return Math.max(pickstarting,pickending);

       



        

    }
}