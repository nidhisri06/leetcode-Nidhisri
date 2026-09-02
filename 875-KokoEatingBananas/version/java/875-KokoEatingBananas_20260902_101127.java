// Last updated: 02/09/2026, 10:11:27
1class Solution {
2    private int numOfCameras = 0;
3    
4    public int minCameraCover(TreeNode root) {
5        return dfs(root) == -1 ? numOfCameras + 1 : numOfCameras;
6    }
7    
8    // -1: NOT MONITORED
9    //  0: MONITORED
10    //  1: HAS CAMERA
11    private int dfs(TreeNode root) {
12        if (root == null) return 0;
13        
14        int left = dfs(root.left);
15        int right = dfs(root.right);
16        
17        if (left == -1 || right == -1) {
18            numOfCameras++;
19            return 1; 
20        }
21        
22        if (left == 1 || right == 1)
23            return 0; 
24        
25        return -1;
26    }
27}