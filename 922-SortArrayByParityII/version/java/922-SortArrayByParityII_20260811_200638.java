// Last updated: 11/08/2026, 20:06:38
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int n = nums.length;
4        int i = 0, j = 1;
5        while (i < n && j < n) {
6            if (nums[i] % 2 == 0) i += 2;
7            else if (nums[j] % 2 == 1) j += 2;
8            else {
9                int temp = nums[i];
10                nums[i] = nums[j];
11                nums[j] = temp;
12                i += 2;
13                j += 2;
14            }
15        }
16        return nums;
17    }
18}