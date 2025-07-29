class Solution {
    class dsu{
        List<Integer> parent = new ArrayList<>();
        List<Integer> rank = new ArrayList<>();
        
        public dsu(int n){
            for(int i =0;i<n;i++){
                parent.add(i); 
            rank.add(0);
            }

        }
        int find(int n){
            if(n==parent.get(n)) return n;

            int ult = find(parent.get(n));
            parent.set(n,ult);
            return parent.get(n);
        }
        void union(int a,int b){
            int ua = find(a);
            int ub = find(b);
            if(ua==ub) return;

            if(rank.get(ua)<rank.get(ub)){
                parent.set(ua,ub);
            }
            else if( rank.get(ua)>rank.get(ub)) parent.set(ub,ua);

            else{
                parent.set(ua,ub);
                rank.set(ub,rank.get(ub)+1);
            }

        }
    }
    public boolean equationsPossible(String[] equations) {

        dsu d = new dsu(26);

        for(String s:equations){
            if(s.charAt(1)=='='){
                d.union((int)(s.charAt(0)-'a'),(int)(s.charAt(3)-'a'));
            }
        }
        System.out.println(d.parent);

        for(String s:equations){
            if(s.charAt(1)=='!'){
                if(d.find((int)(s.charAt(0)-'a')) == d.find((int)(s.charAt(3)-'a'))) return false;
            }
        }
        return true;
        
    }
}