// Last updated: 12/08/2026, 19:48:06
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    // Helper method to cross-validate two trees in a 1-to-1 matching sequence 👯
    public boolean helper(TreeNode p, TreeNode q) {
        // Case 1: Both nodes are null — structural boundary match ✓
        if (p == null && q == null) return true;
        
        // Case 2: One node is null while the other exists — structural mismatch ✗
        if (p == null || q == null) return false;
        
        // Case 3: The values of the corresponding nodes don't match ✗
        if (p.val != q.val) return false;
        
        // Recursively match the left subtrees together AND the right subtrees together 🔄
        return helper(p.left, q.left) && helper(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Launch simultaneous comparisons from the roots of both trees
        return helper(p, q);
    }
}