// Last updated: 4/26/2025, 5:11:06 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int numsLength = nums.length;
        return buildBST(nums, 0, numsLength-1);
    }

    private TreeNode buildBST(int[] nums, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start+(end-start)/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = buildBST(nums, start, mid-1);
        node.right = buildBST(nums, mid+1, end);

        return node;
    }
}