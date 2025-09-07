class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        Map<Integer,Integer> mapa = new HashMap<>();
        Map<Integer,Integer> mapb= new HashMap<>();
        for(int i =0;i<n;i++){
            mapa.put(A[i],i);
            mapb.put(B[i],i);
        }
        int a[] = new int[n];
        if(A[0]==B[0]) a[0] = 1;
        else a[0] = 0;
        for(int i =1;i<n;i++){
            int count =0;
            for(int j = i;j>=0;j--){
                if(mapb.containsKey(B[j]) && mapa.get(B[j])<=i) count++;
            }
            a[i] = count;
            
        }
        return a;

        
    }
}