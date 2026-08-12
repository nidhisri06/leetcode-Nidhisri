// Last updated: 12/08/2026, 15:14:30
1import java.util.*;
2class Solution {
3    public List<Integer> postorderTraversal(TreeNode root) {
4        List<Integer> result = new ArrayList<>();
5        dfs(root, result);
6        return result;
7    }
8    
9    private void dfs(TreeNode node, List<Integer> result) {
10        if (node == null) return;
11        dfs(node.left, result);       // Traverse left subtree
12        dfs(node.right, result);      // Traverse right subtree
13        result.add(node.val);         // Visit root
14    }
15}