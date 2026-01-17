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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
 
        fun(root,l);

        return l.get(k-1);
        
    }
    static void fun(TreeNode root,List<Integer> l){
        if( root==null) return;

        fun(root.left,l);
        l.add(root.val);
        fun(root.right,l);
    }
}