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
    int count = 0;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        //in order traversal, and k-- start at the smallest usingt dfs
        count = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        count--;
        if (count == 0) res = root.val;
        dfs(root.right);
    }
}
