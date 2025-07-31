class Solution {
    class dsu{
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        int val;
        

        public dsu(int n){
            val = n;
            for(int i =0;i<n;i++){
                rank.add(0);
                parent.add(i);
        }

        }
        int find(int n){
            if(n==parent.get(n)) return n;
            int u = find(parent.get(n));
            parent.set(n,u);
            return parent.get(n);

        }
        void union (int a,int b){
            int ua = find(a);
            int ub = find(b);
            if(ua==ub) return ;
            if(rank.get(ua)>rank.get(ub)){
                parent.set(ub,ua);

            }
            else if(rank.get(ua)<rank.get(ub)){
                parent.set(ua,ub);


            }
            else{
                parent.set(ua,ub);
                rank.set(ub,rank.get(ub)+1);
                




            }
            val--;
        }
        int getval(){
            return val;
        }


    }
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        dsu d = new dsu(strs.length);
        for(int i=0;i< n-1;i++){
            for(int j = i+1;j<n;j++){
                if(similar(strs[i],strs[j])) d.union(i,j);
            }
        }
        return d.getval();

        
    }
    boolean similar(String s,String p){
        
        if(s.equals(p)) return true;
        int n = s.length();
        int res = 0;
        //List<Integer> dis = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(s.charAt(i)!=p.charAt(i)) res++;
        }
        
        return res<=2;

        
    }
}