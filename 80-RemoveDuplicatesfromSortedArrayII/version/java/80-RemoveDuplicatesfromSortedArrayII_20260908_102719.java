// Last updated: 08/09/2026, 10:27:19
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4        int left = 0, right = 0;
5        long res = 0, total = 0;
6
7        while (right < nums.length) {
8            total += nums[right];
9
10            while (nums[right] * (right - left + 1L) > total + k) {
11                total -= nums[left];
12                left += 1;
13            }
14
15            res = Math.max(res, right - left + 1L);
16            right += 1;
17        }
18
19        return (int) res;        
20    }
21}