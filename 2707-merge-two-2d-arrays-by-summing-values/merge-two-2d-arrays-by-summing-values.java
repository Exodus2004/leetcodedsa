class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Set<Integer> set  = new HashSet<>();
        for(int i[]: nums1) set.add(i[0]);
        for(int i[]: nums2) set.add(i[0]);

        int n = set.size();
        int  a[][] = new int[n][2];
        int i = 0;
        int j = 0;
        int k =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                a[k][0] = nums1[i][0];
                a[k][1] = nums1[i][1]+nums2[j][1];
                k++;
                i++;
                j++;
            }
            else if(nums1[i][0]> nums2[j][0]){
                a[k][0] = nums2[j][0];
                a[k][1] = nums2[j][1];
                k++;
                j++;

            }
            else{
                a[k][0] = nums1[i][0];
                a[k][1] = nums1[i][1];
                k++;
                i++;

            }
        }

        while(i<nums1.length){
            a[k][0] = nums1[i][0];
            a[k][1] = nums1[i][1];
            k++;
            i++;
        }
        while(j<nums2.length){
            a[k][0] = nums2[j][0];
            a[k][1] = nums2[j][1];
            k++;
            j++;
        }
        return a;
        
    }
}