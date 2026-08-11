// Last updated: 11/08/2026, 19:25:45
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length;
4
5        if (n == 1) return 0;
6
7        if (nums[0] > nums[1]) return 0;
8        if (nums[n - 1] > nums[n - 2]) return n - 1;
9
10        int left = 1;
11        int right = n - 2;
12
13        while (left <= right) {
14            int mid = left + (right - left) / 2;
15
16            if (nums[mid] > nums[mid - 1] &&
17                nums[mid] > nums[mid + 1]) {
18                return mid;
19            }
20
21            else if (nums[mid] > nums[mid - 1]) {
22                left = mid + 1;
23            }
24
25            else {
26                right = mid - 1;
27            }
28        }
29
30        return -1;
31    }
32}