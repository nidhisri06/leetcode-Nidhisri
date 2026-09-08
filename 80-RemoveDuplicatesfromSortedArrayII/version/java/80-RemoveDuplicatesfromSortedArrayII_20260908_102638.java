// Last updated: 08/09/2026, 10:26:38
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        int ans = 0;
5
6        for (int i = 0; i < n; i++) {
7            int product = 1;
8
9            for (int j = i; j < n; j++) {
10                product *= nums[j];
11
12                if (product < k) {
13                    ans++;
14                } else {
15                    break;
16                }
17            }
18        }
19        return ans;
20    }
21}