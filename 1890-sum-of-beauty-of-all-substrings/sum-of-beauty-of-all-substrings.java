class Solution {
    public int beautySum(String s) {
        int n =s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            int a[] = new int[26];
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                a[c-'a']++;
                //System.out.println(Arrays.toString(a));

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int x :a){
                    if(x!=0){
                        max = Math.max(max,x);
                        min = Math.min(min,x);
                    }
                }
                sum+=(max-min);
            }
        }
        return sum;
        
    }
}