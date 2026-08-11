// Last updated: 11/08/2026, 19:34:44
1class Solution {
2    public double myPow(double x, int n) {
3        if (n == 0) return 1.0;
4        if (x == 0) return 0.0;
5        if (x == 1) return 1.0;
6        if (x == -1 && n % 2 == 0) return 1.0;
7        if (x == -1 && n % 2 != 0) return -1.0;
8
9        double ans = 1;
10        long m = n;
11        if (m < 0) {
12            m = -m;
13            x = 1 / x;
14        }
15        long binForm = m;
16        while (binForm > 0) {
17            if (binForm % 2 == 1) ans *= x;
18            x *= x;
19            binForm /= 2;
20        }
21        return ans;
22    }
23}