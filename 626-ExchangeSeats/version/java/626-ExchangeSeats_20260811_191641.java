// Last updated: 11/08/2026, 19:16:41
1class Solution {
2    int[][] dir = {{0, 1},{1, 0},{0, -1},{-1, 0},{-1, 1},{1, 1},{1, -1},{-1, -1},{0, 0}};
3    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
4        Map<Integer, Boolean> lamp = new HashMap<Integer, Boolean>();
5        Map<Integer, Integer> row = new HashMap<Integer, Integer>();
6        Map<Integer, Integer> col = new HashMap<Integer, Integer>();
7        Map<Integer, Integer> diagTopLeft = new HashMap<Integer, Integer>();
8        Map<Integer, Integer> diagBottomLeft = new HashMap<Integer, Integer>();
9        for (int i = 0; i < lamps.length; ++i) {
10            int x = lamps[i][0];
11            int y = lamps[i][1];
12            if(lamp.getOrDefault(x * N + y, false))
13                continue;
14            row.put(x, row.getOrDefault(x, 0) + 1);
15            col.put(y, col.getOrDefault(y, 0) + 1);
16            diagTopLeft.put(x - y, diagTopLeft.getOrDefault(x - y, 0) + 1);
17            diagBottomLeft.put(x + y, diagBottomLeft.getOrDefault(x + y, 0) + 1);
18            lamp.put(x * N + y, true);
19        }
20        int[] ans = new int[queries.length];
21        for (int i = 0; i < queries.length; i++) {
22            int x = queries[i][0];
23            int y = queries[i][1];
24            ans[i] = (row.getOrDefault(x, 0) > 0 ||
25                      col.getOrDefault(y, 0) > 0 ||
26                      diagTopLeft.getOrDefault(x - y, 0) > 0 ||
27                      diagBottomLeft.getOrDefault(x + y, 0) > 0) ? 1 : 0;
28            for (int j = 0; j < dir.length; j++) {
29                int r = x + dir[j][0];
30                int c = y + dir[j][1];
31                if (r >= 0 && c >= 0 && r < N && c < N && lamp.getOrDefault(r * N + c, false) == true) { //lamp.containsKey(r * N + c)
32                    // System.out.println("Bulb : " + r + " " + c);
33                    row.put(r, row.getOrDefault(r, 1) - 1);
34                    col.put(c, col.getOrDefault(c, 1) - 1);
35                    diagTopLeft.put(r - c, diagTopLeft.getOrDefault(r - c, 1) - 1);
36                    diagBottomLeft.put(r + c, diagBottomLeft.getOrDefault(r + c, 1) - 1);
37                    lamp.put(r * N + c, false);
38                }
39            }
40        }
41        return ans;
42    }
43}