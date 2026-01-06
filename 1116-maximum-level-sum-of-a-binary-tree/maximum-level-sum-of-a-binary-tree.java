/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Map<Integer,List<Integer>> map;
    public int maxLevelSum(TreeNode root) {
        map = new HashMap<>();
        fun(root,0);
        int max = Integer.MIN_VALUE;
        int lev = 0;
        for(int i : map.keySet()){
            int sum = funs(map.get(i));
            
            if(sum>max){
                max = sum;
                lev = i;
            }
            

        }
        return lev+1;


        
    }
    int funs(List<Integer> l){
        int  sum = 0;
        for(int i:l) sum = sum+i;

        return sum;

    }
    void fun(TreeNode root,int level){
        if(root==null) return;
        map.putIfAbsent(level,new ArrayList<>());
        map.get(level).add(root.val);
        fun(root.left,level+1);
        fun(root.right,level+1);



    }
}