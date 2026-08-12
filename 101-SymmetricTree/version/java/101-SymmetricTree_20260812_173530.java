// Last updated: 12/08/2026, 17:35:30
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return check(root) != -1;
4    }
5
6    private int check(TreeNode node) {
7        if (node == null) return 0;
8
9        int left_h = check(node.left);
10        if (left_h == - 1) return -1;
11
12        int right_h = check(node.right);
13        if (right_h == -1) return -1;
14
15        if (Math.abs(left_h - right_h) > 1) {
16            return -1;
17        }
18
19        return Math.max(left_h, right_h) + 1;
20    }
21}