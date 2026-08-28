// Last updated: 28/08/2026, 10:21:45
1class Solution {
2    public int search(int[] nums, int target) {
3        int start = 0, end = nums.length - 1;
4
5        while (start <= end) {
6            int mid = start + (end - start) / 2;
7
8            if (nums[mid] == target) return mid;
9
10            // Check if left part is sorted
11            if (nums[mid] >= nums[start]) {
12                if (target >= nums[start] && target < nums[mid]) {
13                    end = mid - 1; // move left
14                } else {
15                    start = mid + 1; // move right
16                }
17            } 
18            // Right part is sorted
19            else {
20                if (target > nums[mid] && target <= nums[end]) {
21                    start = mid + 1; // move right
22                } else {
23                    end = mid - 1; // move left
24                }
25            }
26        }
27
28        return -1;
29    }
30}