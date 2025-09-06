class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set= new TreeSet<>();
        TreeSet<Integer> tables = new TreeSet<>();
        
        for(List<String> i:orders){
            tables.add(Integer.parseInt(i.get(1)));
        } 
        for(List<String> i:orders){
            set.add(i.get(2));
        } 
        List<Integer> table = new ArrayList<>(tables);
        List<String> first = new LinkedList<>(set);
        first.addFirst("Table");
        Map<List<String>,Integer> items = new HashMap<>();
        for(List<String> i:orders){
            List<String> t = new ArrayList<>();
            t.add(i.get(1));
            t.add(i.get(2));
            items.put(t,items.getOrDefault(t,0)+1);
        }
        res.add(new ArrayList<>(first));
        for(int i =0;i<tables.size();i++){
            List<String> temp = new ArrayList<>();
            temp.add(String.valueOf(table.get(i)));
            for(int j=1;j<first.size();j++){
                List<String> k = Arrays.asList(String.valueOf(table.get(i)),first.get(j));
                if(items.containsKey(k)) temp.add(String.valueOf(items.get(k)));
                else temp.add(String.valueOf("0"));
            }
            res.add(new ArrayList<>(temp));


        }
        

        
        



        return res;

        
    }
}