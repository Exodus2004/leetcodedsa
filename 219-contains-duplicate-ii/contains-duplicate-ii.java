class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        boolean t = false;
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        boolean p= false;

        for(int i =0;i<n;i++){
            while(map.containsKey(a[i])){
                
                if(Math.abs(map.get(a[i])-i)<=k) p = true;
                if(p) return p;
                map.remove(a[i]);
            }
            if(!map.containsKey(a[i])){
                map.put(a[i],i);
            }
        }

       


        
        return p;
        
    }
}