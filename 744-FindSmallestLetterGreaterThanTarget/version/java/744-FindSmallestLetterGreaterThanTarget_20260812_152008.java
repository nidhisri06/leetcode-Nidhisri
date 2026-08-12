// Last updated: 12/08/2026, 15:20:08
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 * int val;
5 * TreeNode left;
6 * TreeNode right;
7 * TreeNode() {}
8 * TreeNode(int val) { this.val = val; }
9 * TreeNode(int val, TreeNode left, TreeNode right) {
10 * this.val = val;
11 * this.left = left;
12 * this.right = right;
13 * }
14 * }
15 */
16class Solution {
17
18    // Helper method to cross-validate two trees in a 1-to-1 matching sequence 👯
19    public boolean helper(TreeNode p, TreeNode q) {
20        // Case 1: Both nodes are null — structural boundary match ✓
21        if (p == null && q == null) return true;
22        
23        // Case 2: One node is null while the other exists — structural mismatch ✗
24        if (p == null || q == null) return false;
25        
26        // Case 3: The values of the corresponding nodes don't match ✗
27        if (p.val != q.val) return false;
28        
29        // Recursively match the left subtrees together AND the right subtrees together 🔄
30        return helper(p.left, q.left) && helper(p.right, q.right);
31    }
32
33    public boolean isSameTree(TreeNode p, TreeNode q) {
34        // Launch simultaneous comparisons from the roots of both trees
35        return helper(p, q);
36    }
37}