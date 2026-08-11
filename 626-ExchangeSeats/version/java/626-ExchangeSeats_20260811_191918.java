// Last updated: 11/08/2026, 19:19:18
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int[][] res = new int[matrix[0].length][matrix.length];
4
5        for (int r = 0; r < matrix.length; r++) {
6            for (int c = 0; c < matrix[0].length; c++) {
7                res[c][r] = matrix[r][c];
8            }
9        }
10
11        return res;        
12    }
13}