// Last updated: 28/08/2026, 10:28:33
1public class Solution {
2    int max = Integer.MIN_VALUE;
3    
4    public int maxPathSum(TreeNode root) {
5        helper(root);
6        return max;
7    }
8    
9    // helper returns the max branch 
10    // plus current node's value
11    int helper(TreeNode root) {
12        if (root == null) return 0;
13        
14        int left = Math.max(helper(root.left), 0);
15        int right = Math.max(helper(root.right), 0);
16        
17        max = Math.max(max, root.val + left + right);
18        
19        return root.val + Math.max(left, right);
20    }
21}