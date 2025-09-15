class Solution {
    class pair{
        String cur;
        int count;
        pair(String cur,int count){
            this.cur = cur;
            this.count = count;
        }
    }
    public int openLock(String[] deadends, String target) {
        Set<String> given = new HashSet<>();
        for(String s:deadends) given.add(s);
        String start ="0000";
        if(given.contains(start)) return -1;
        Queue<pair> q =new LinkedList<>();
        Set<String> visited = new HashSet<>();
        visited.add(start);
        q.add(new pair(start,0));

        while(!q.isEmpty()){
            pair t = q.poll();
            String current = t.cur;
            int count = t.count ;
            if(current.equals(target)) return count;
            for(int i =0;i<current.length();i++){
                char a[] = current.toCharArray();
                char original = a[i];
                int val = (int)(original-'0');
                char p = '0';
                char n = '0';
                if(val==0){
                    n ='1';
                    p = '9';

                }
                else if(val==9){
                    n='0';
                    p ='8';
                }
                else {
                     p = (char)(((val+1)%10)+'0');
                     n = (char)(((val-1)%10)+'0');
                }
                a[i] = p;

                String newcurrent = new String(a);
                    if(!given.contains(newcurrent)  && !visited.contains(newcurrent)){
                        visited.add(newcurrent);
                        q.add(new pair(newcurrent,count+1));
                    }
                
                a[i] = n;
                String newc = new String(a);
                if(!given.contains(newc)  && !visited.contains(newc)){
                        visited.add(newc);
                        q.add(new pair(newc,count+1));
                    }
                
            }
        }
        return -1;

        
    }
}