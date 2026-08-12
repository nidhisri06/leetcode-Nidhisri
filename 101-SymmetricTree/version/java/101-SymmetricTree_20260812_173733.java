// Last updated: 12/08/2026, 17:37:33
1class Solution {
2    public TreeNode searchBST(TreeNode root, int val) {
3        if (root == null) {
4            return null;
5        }
6        if (root.val == val) {
7            return root;
8        } else if (root.val > val) {
9            return searchBST(root.left, val);
10        } else {
11            return searchBST(root.right, val);
12        }        
13    }
14}