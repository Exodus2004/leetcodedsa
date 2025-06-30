class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;


        int a[] = new int[n1];
        Stack<Integer> s = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = n2-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]) s.pop();

        if(s.isEmpty()) map.put(nums2[i],-1);

            else map.put(nums2[i],s.peek());

            s.push(nums2[i]);
        }



        for(int i =0;i<n1;i++){
            a[i] = map.get(nums1[i]);
            
        }

        return a;

        
    }
}