class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        Set<String> s = new HashSet<>();
        int max = 0;
        for(int i =0;i<n;i++){
           for(int j = 0;j<Integer.toString(arr1[i]).length();j++) {
            s.add(Integer.toString(arr1[i]).substring(0,j+1));
           }
        }
        System.out.println(s);

        for(int i =0;i<m;i++){
           for(int j = 0;j<Integer.toString(arr2[i]).length();j++) {
            if(s.contains(Integer.toString(arr2[i]).substring(0,j+1))) max = Math.max(max, j + 1);
           }
        }
        return max;
    }
}