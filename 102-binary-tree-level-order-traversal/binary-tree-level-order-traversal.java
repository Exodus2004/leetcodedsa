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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> tem = new ArrayList<>();
            int n = q.size();
            for(int i =0;i<n;i++){
            TreeNode cur = q.poll();
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
            tem.add(cur.val);
            }
            res.add(new ArrayList<>(tem));
        }
        return res;

        
    }
}