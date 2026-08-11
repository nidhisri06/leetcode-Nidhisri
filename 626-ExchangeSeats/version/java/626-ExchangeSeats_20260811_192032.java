// Last updated: 11/08/2026, 19:20:32
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing = true;
4        boolean decreasing = true;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > nums[i - 1]) {
8                decreasing = false;
9            } else if (nums[i] < nums[i - 1]) {
10                increasing = false;
11            }
12
13            if (!increasing && !decreasing) {
14                return false;
15            }
16        }
17
18        return true;
19    }
20}