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

    public class QueueNode{
        TreeNode root;
        Integer max;
        Integer min;
        QueueNode(TreeNode root, Integer min, Integer max){
            this.root = root;
            this.min = min;
            this.max = max;
        }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Queue<QueueNode> q = new LinkedList<>();
        q.add(new QueueNode(root, null, null));
        while(!q.isEmpty()){
            QueueNode curr = q.poll();
            TreeNode currNode = curr.root;
            if (curr.min != null && currNode.val <= curr.min) return false;
            if (curr.max != null && currNode.val >= curr.max) return false;
            if (currNode.left != null){
                q.add(new QueueNode(currNode.left, curr.min, currNode.val));
            }
            if (currNode.right != null){
                q.add(new QueueNode(currNode.right, currNode.val, curr.max));
            }
        }
        return true;
    }
}
