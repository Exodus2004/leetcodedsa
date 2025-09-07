class Solution {
    public int[] sumZero(int n) {
        int a[] = new int[n];
        TreeSet<Integer> res = new TreeSet<>();

        if(n%2==0){
            for(int i= 1;i<=n/2;i++){
                res.add(i);
                res.add(-1*i);

            }

        }
        else{
            res.add(0);
            for(int i=0;i<=n/2;i++){
                
                res.add(i);
                res.add(-1*i);
            }

        }
        System.out.println(res);
        List<Integer> k = new ArrayList<>(res);
        for(int i=0;i<n;i++) a[i] = k.get(i);
        return a;
        
    }
}