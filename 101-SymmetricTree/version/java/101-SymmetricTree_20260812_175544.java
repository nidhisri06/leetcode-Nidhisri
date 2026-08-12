// Last updated: 12/08/2026, 17:55:44
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        long n = arr.length;
4        if (n == 1) return 1;
5        
6        int up = 1, down = 1, res = 1;
7        
8        for (int i = 1; i < n; i++) {
9            if (arr[i] > arr[i-1]) {
10                up = down + 1;
11                down = 1;
12            } else if (arr[i] < arr[i-1]) {
13                down = up + 1;
14                up = 1;
15            } else {
16                up = down = 1;
17            }
18            
19            res = Math.max(res, Math.max(up, down));
20        }
21
22        return res;
23    }
24}