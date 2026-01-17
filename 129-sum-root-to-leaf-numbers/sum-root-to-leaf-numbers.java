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
    public int sumNumbers(TreeNode root) {

        if(root==null) return 0;
        return fun(root,0);
        
    }
    static int fun(TreeNode root,int cs){
        if(root==null) return 0;

        if(root.left==null && root.right==null) return cs = cs*10 + root.val;

        return fun(root.left,cs*10 + root.val)+fun(root.right,cs*10 + root.val);





    }
}