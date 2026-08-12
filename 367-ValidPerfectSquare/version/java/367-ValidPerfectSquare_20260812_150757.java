// Last updated: 12/08/2026, 15:07:57
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if (num < 2) return true;
4
5        long low = 1, high = num;
6
7        while (low <= high) {
8            long mid = low + (high - low) / 2;
9
10            if (mid * mid == num) {
11                return true;
12            } else if (mid * mid > num) {
13                high = mid - 1;
14            } else {
15                low = mid + 1;
16            }
17        }
18
19        return false;
20    }
21}