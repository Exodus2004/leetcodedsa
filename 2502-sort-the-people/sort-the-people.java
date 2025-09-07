class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i =0;i<names.length;i++) map.put(heights[i],names[i]);
        System.out.println(map);
        int i =  names.length-1;
        for(String s:map.values()) names[i--] = s;
        
        return names;
    }
}