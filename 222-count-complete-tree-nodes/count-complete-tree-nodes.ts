/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function countNodes(root: TreeNode | null): number {
  if (!root) return 0;

  // Calculate the height of the tree
  let height = 0;
  let node = root;
  while (node.left) {
    height++;
    node = node.left;
  }

  // Use binary search to find the number of nodes at the last level
  let left = 0, right = Math.pow(2, height) - 1; // Max nodes at the last level
  while (left <= right) {
    const mid = Math.floor((left + right) / 2);
    if (nodeExists(root, height, mid)) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return Math.pow(2, height) - 1 + left;
}

// Helper function to check if a node exists at the given index in the last level
function nodeExists(root: TreeNode | null, height: number, index: number): boolean {
  let left = 0, right = Math.pow(2, height) - 1;
  let node = root;
  for (let i = 0; i < height; i++) {
    const mid = Math.floor((left + right) / 2);
    if (index <= mid) {
      node = node.left!;
      right = mid;
    } else {
      node = node.right!;
      left = mid + 1;
    }
  }
  return node !== null;
}