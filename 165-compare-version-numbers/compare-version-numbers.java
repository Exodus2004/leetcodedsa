class Solution {
    public int compareVersion(String version1, String version2) {
       String a[] = version1.split("\\.");      
       String b[] = version2.split("\\.");
       int i = 0;
       int j = 0;
       int res = 0;
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
       while(i<a.length || j<b.length){
        int x = 0;
        int y = 0;
        if(i<a.length) x = Integer.parseInt(a[i]);
        if(j<b.length) y = Integer.parseInt(b[j]);
        if(x>y) return 1;
        else if(x<y) return -1;
        i++;
        j++;

       }
       return 0;
        
    }
}