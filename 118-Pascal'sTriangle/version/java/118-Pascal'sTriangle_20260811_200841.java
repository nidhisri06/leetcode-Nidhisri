// Last updated: 11/08/2026, 20:08:41
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int[] max = new int[n];
8
9        for (int i = 0; i < n; i++) {          // column
10            for (int j = 0; j < m; j++) {      // row
11                max[i] = Math.max(max[i], matrix[j][i]);
12            }
13        }
14
15        for (int i = 0; i < m; i++) {          // row
16            for (int j = 0; j < n; j++) {      // column
17                if (matrix[i][j] == -1) {
18                    matrix[i][j] = max[j];
19                }
20            }
21        }
22
23        return matrix;
24    }
25}