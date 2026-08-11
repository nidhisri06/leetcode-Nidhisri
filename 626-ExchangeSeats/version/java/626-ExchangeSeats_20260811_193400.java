// Last updated: 11/08/2026, 19:34:00
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3        int x0 = coordinates[0][0];
4        int y0 = coordinates[0][1];
5        int x1 = coordinates[1][0];
6        int y1 = coordinates[1][1];
7        
8        for (int i = 2; i < coordinates.length; i++) {
9            int x = coordinates[i][0];
10            int y = coordinates[i][1];
11            if ((x - x0) * (y1 - y0) != (y - y0) * (x1 - x0)) {
12                return false;
13            }
14        }
15        
16        return true;
17    }
18}