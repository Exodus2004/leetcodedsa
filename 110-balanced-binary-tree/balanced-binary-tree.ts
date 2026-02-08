/**
 * Definition for a binary tree node.
 * class TreeNode {
 * val: number
 * left: TreeNode | null
 * right: TreeNode | null
 * constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 * this.val = (val===undefined ? 0 : v)
 * this.left = (left===undefined ? null : left)
 * this.right = (right===undefined ? null : right)
 * }
 * }
 */

function isBalanced(root: TreeNode | null): boolean {
    if (!root) return true;

    let isGood = true;

    let go = (node: TreeNode): number => {
        if (!isGood) return 0;

        let leftLength = 0; 
        let rightLength = 0; 

        if (node.left) {
            leftLength = go(node.left);
        }

        if (node.right) {
            rightLength = go(node.right);
        }

        if (Math.abs(leftLength - rightLength) > 1) {
            isGood = false;
        }

        return Math.max(leftLength, rightLength) + 1;
    }

    go(root);

    return isGood;
};