// Last updated: 12/08/2026, 15:15:50
1class Solution {
2    public List<Double> averageOfLevels(TreeNode root) {
3        Queue<TreeNode> q = new LinkedList<>(List.of(root));
4        List<Double> ans = new ArrayList<>();
5        while (q.size() > 0) {
6            double qlen = q.size(), row = 0;
7            for (int i = 0; i < qlen; i++) {
8                TreeNode curr = q.poll();
9                row += curr.val;
10                if (curr.left != null) q.offer(curr.left);
11                if (curr.right != null) q.offer(curr.right);
12            }
13            ans.add(row/qlen);
14        }
15        return ans;
16    }
17}