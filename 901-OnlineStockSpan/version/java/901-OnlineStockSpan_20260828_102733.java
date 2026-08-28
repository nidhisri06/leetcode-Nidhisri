// Last updated: 28/08/2026, 10:27:33
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3
4        int first = -1;
5        int left = 0, right = nums.length - 1;
6
7        // Find first occurrence
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target) {
12                first = mid;
13                right = mid - 1;
14            } else if (nums[mid] < target) {
15                left = mid + 1;
16            } else {
17                right = mid - 1;
18            }
19        }
20
21        if (first == -1) {
22            return new int[]{-1, -1};
23        }
24
25        int last = -1;
26        left = 0;
27        right = nums.length - 1;
28
29        // Find last occurrence
30        while (left <= right) {
31            int mid = left + (right - left) / 2;
32
33            if (nums[mid] == target) {
34                last = mid;
35                left = mid + 1;
36            } else if (nums[mid] < target) {
37                left = mid + 1;
38            } else {
39                right = mid - 1;
40            }
41        }
42
43        return new int[]{first, last};
44    }
45}