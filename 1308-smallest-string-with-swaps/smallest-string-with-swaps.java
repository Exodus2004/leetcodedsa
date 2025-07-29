class Solution {
    class dsu{
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        public dsu(int n){
            for(int i=0;i<n;i++){
                rank.add(0);
                parent.add(i);
            }
        }
        int find(int n){
            if(n==parent.get(n)) return n;
            int val = find(parent.get(n));

            parent.set(n,val);
            return parent.get(n);

        
        }
        void union(int a,int b){
            int ulta = find(a);
            int ultb = find(b);
            if(ulta==ultb) return;
            if(rank.get(ulta)<rank.get(ultb)){
                parent.set(ulta,ultb);
            }
            else if(rank.get(ulta)>rank.get(ultb)){
            parent.set(ultb,ulta);

                
            }
            else{
                parent.set(ulta,ultb);
                rank.set(ultb,rank.get(ultb)+1);
            }
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        dsu d=new dsu(s.length());
        

        for(List<Integer> i:pairs){
            d.union(i.get(0),i.get(1));
        } 
        Map<Integer,PriorityQueue<Character>> map = new HashMap<>();

         for (int i = 0; i < s.length(); i++) {
            int root = d.find(i);
            map.putIfAbsent(root, new PriorityQueue<>());
            map.get(root).offer(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            int par = d.find(i);
            char c = map.get(par).poll();
            sb.append(c);
        }
        return sb.toString();

        
        
        
        
    }
}