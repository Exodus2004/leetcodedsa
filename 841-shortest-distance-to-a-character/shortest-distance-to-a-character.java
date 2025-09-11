class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                list.add(0);
                continue;
            }
            int min  = Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    min = Math.min(min,Math.abs(i-j));
                    
                }
                
            }
            list.add(min);
        }
        System.out.println(list);
        int a[] =  new int[s.length()];
        int k = 0;
        for(int i:list) a[k++] = i;
        return a;
        
    }
}