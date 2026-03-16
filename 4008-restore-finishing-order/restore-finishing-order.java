class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int i :friends) set.add(i);
        int a[] = new int[friends.length];
        int x = 0;
        for(int i:order){
            if(set.contains(i)) a[x++] = i;
        }
        return a;
        
    }
}