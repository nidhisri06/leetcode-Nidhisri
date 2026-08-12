// Last updated: 12/08/2026, 19:37:17
1class Solution {
2    int MOD = 1000000007;
3    public int sumDistance(int[] nums, String s, int d) {
4        int n = nums.length;
5        long[] dest = new long[n];
6        for (int i = 0; i < n; i++) {
7            if (s.charAt(i) == 'L') {
8                dest[i] = (long)nums[i] - d;
9            } else {
10                dest[i] = (long)nums[i] + d;
11            }
12        }
13        Arrays.sort(dest);
14        long res = 0;
15        for (int i = 0; i < n; i++) {
16            res = (res + dest[i] * i) % MOD;
17            res = (res - dest[i] * (n-i-1) + MOD) % MOD;
18        }
19        return (int)res;
20    }
21}