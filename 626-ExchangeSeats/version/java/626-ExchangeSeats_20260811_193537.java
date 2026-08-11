// Last updated: 11/08/2026, 19:35:37
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] seen = new boolean[n];
4        int ans = 0;
5        for (int num = 2; num < n; num++) {
6            if (seen[num]) continue;
7            ans += 1;
8            for (long mult = (long)num * num; mult < n; mult += num)
9                seen[(int)mult] = true;
10        }
11        return ans;
12    }
13}