class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i:candies) max = Math.max(max,i);
        List<Boolean> list = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            list.add(check(candies,candies[i]+extraCandies));
        }
        return list;
        
    }
    boolean check(int a[],int val){
        for(int i:a){
            if(val<i) return false;
        }
        return true;
    }
}