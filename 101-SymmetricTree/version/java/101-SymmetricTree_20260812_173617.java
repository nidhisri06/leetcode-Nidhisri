// Last updated: 12/08/2026, 17:36:17
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3        List<String> result = new ArrayList<>();
4        dfs(root, "", result);
5        return result;
6    }
7
8    private void dfs(TreeNode node, String path, List<String> result) {
9        if (node == null) return;
10        //Append the current node's value to the path.
11        path += node.val;
12
13        //If it's a leaf node, add the path to the result list.
14        if (node.left == null && node.right == null) {
15            result.add(path);
16        } else {
17            path += "->";// Separate nodes in the path.
18            dfs(node.left, path, result);
19            dfs(node.right, path, result);
20        }
21    }
22}