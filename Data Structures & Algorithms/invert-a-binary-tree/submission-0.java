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
    public TreeNode invertTree(TreeNode root) {
        TreeNode curr = root;
        if (root == null) return null;
        if(curr.left == null && curr.right == null){
            return curr;
        }
        else if(curr.left == null && curr.right != null){
            curr.left = curr.right;
            curr.right = null;
            curr = curr.left;
            curr = invertTree(curr);
        }
        else if (curr.left != null && curr.right == null){
            curr.right = curr.left;
            curr.left = null;
            curr = curr.right;
            curr = invertTree(curr);
        }
        else{
            TreeNode tmp = curr.left;
            curr.left = curr.right;
            curr.right = tmp;
            tmp = invertTree(curr.left);
            curr = curr.right;
            curr = invertTree(curr);
        }
        return root;
    }
}
