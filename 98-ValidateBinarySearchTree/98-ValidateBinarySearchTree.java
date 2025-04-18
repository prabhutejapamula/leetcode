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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE); //
    }

    public boolean valid(TreeNode root, long mini, long maxi){
        if(root == null) return true;
        if(!(root.val > mini && root.val < maxi)) return false;
        return valid(root.left, mini, root.val) && valid(root.right, root.val, maxi);
    }
}