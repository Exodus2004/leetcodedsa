class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
                System.out.println(fun(nums,k-1));

        return fun(nums, k) - fun(nums, k - 1);

    }

    int fun(int a[], int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int n = a.length;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(a[r], map.getOrDefault(a[r], 0) + 1);


            while (map.size() > k) {
                map.put(a[l], map.get(a[l]) - 1);

                if (map.get(a[l]) == 0)
                    map.remove(a[l]);
                l++;
                //System.out.print(map);
            }
            res += r - l + 1;
            
            r++;

        }
        
        return res;

    }
}