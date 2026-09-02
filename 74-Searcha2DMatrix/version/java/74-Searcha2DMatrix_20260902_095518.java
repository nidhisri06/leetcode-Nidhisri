// Last updated: 02/09/2026, 09:55:18
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int left = 0, right = m * n - 1;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            int mid_val = matrix[mid / n][mid % n];
10
11            if (mid_val == target)
12                return true;
13            else if (mid_val < target)
14                left = mid + 1;
15            else
16                right = mid - 1;
17        }
18        return false;
19    }
20}