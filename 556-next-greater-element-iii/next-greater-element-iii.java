class Solution {
    public int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        char a[] = s.toCharArray();
        int b[] =new int[a.length];
        int k =0;
        for(char c: a) b[k++] = (int)c-'0';

        int piv = -1; 
        int p = b.length;
        for(int i = p-2 ;i>=0;i--){
            if(b[i]<b[i+1]){
                piv = i;
                break;
            }
        }
        
        int min = Integer.MAX_VALUE;
        if(piv==-1) return -1;
        int right = 0;
        for(int i = piv+1;i<p;i++){
            if(b[i]>b[piv] && b[i]<min){
                min = b[i];
                right = i;

            }
        }
        int t = b[piv];
        b[piv] = b[right];
        b[right] = t;

        Arrays.sort(b,piv+1,p);
        StringBuilder sb = new StringBuilder();
        for(int i: b ) sb.append(i);
        if(Long.parseLong(sb.toString())>Integer.MAX_VALUE) return -1;

        return Integer.parseInt(sb.toString());




    

        
        
    }
}