// Last updated: 12/08/2026, 17:31:28
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isMirror(TreeNode a , TreeNode b){
18        if(a == null || b == null){
19            return a == b;
20        }
21        if(a.val != b.val){
22            return false;
23        }
24        return isMirror(a.left , b.right) && isMirror(a.right , b.left);
25    }
26    public boolean isSymmetric(TreeNode root) {
27        return isMirror(root.left , root.right);
28    }
29}