class Solution {
    class dsu{
        List<Integer> rank = new ArrayList<>();
        List< Integer> parent = new ArrayList<>();

        public dsu(int n){
            for(int i =0;i<=n;i++){
                rank.add(0);
                parent.add(i);
            }
        }
        public int find(int n){
            if(n==parent.get(n)) return n;

            int val = find(parent.get(n));
            parent.set(n,val);

            return parent.get(n);
        }
        public void union(int a,int b){
            int ultia = find(a);
            int ultib = find(b);
            if(ultia==ultib) return;

            if(rank.get(ultia)<rank.get(ultib)){
                parent.set(ultia,ultib);
            }
            else if(rank.get(ultia)<rank.get(ultib)){
                parent.set(ultib,ultia);

            }
            else{
                parent.set(ultia,ultib);
                rank.set(ultib,rank.get(ultib)+1);
            }


        }



    }
    public int[] findRedundantConnection(int[][] edges) {

        dsu d = new dsu(edges.length);

        for(int i[]:edges){
            if(d.find(i[0])==d.find(i[1])) return new int[]{i[0],i[1]};

            d.union(i[0],i[1]);
            
                   

        }
        return edges[0];
        
        
        
    }
}