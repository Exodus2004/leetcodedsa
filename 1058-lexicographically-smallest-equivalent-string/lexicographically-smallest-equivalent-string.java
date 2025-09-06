class Solution {
    class dsu {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        public dsu(int n) {

            for (int i = 0; i < n; i++) {
                rank.add(0);
                parent.add(i);
            }

        }

        int find(int n) {
            if (n == parent.get(n))
                return n;
            int u = find(parent.get(n));
            parent.set(n, u);
            return parent.get(n);

        }

        void union(int a, int b) {
            int ua = find(a);
            int ub = find(b);
            if (ua == ub)
                return;
            if (ua < ub) {
                parent.set(ub, ua);

            } else{
                parent.set(ua, ub);

            } 

        }

    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        dsu d = new dsu(26);
        for(int i = 0;i<s1.length();i++){
            d.union(s1.charAt(i)-'a',s2.charAt(i)-'a');

        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<baseStr.length();i++){
            int val = d.find(baseStr.charAt(i)-'a');
            sb.append((char)(val+'a'));
        }
        return sb.toString();
        
    }
}