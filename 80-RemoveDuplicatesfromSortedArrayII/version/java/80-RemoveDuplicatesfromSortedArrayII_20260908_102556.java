// Last updated: 08/09/2026, 10:25:56
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return atMost(nums, goal) - atMost(nums, goal - 1);
4    }
5    private int atMost(int[] nums, int goal) {
6        int head, tail = 0, sum = 0, result = 0;
7        for (head = 0; head < nums.length; head++) {
8            sum += nums[head];
9            while (sum > goal && tail <= head) {
10                sum -= nums[tail];
11                tail++;
12            }
13            result += head - tail + 1;
14        }
15        return result;
16    }
17}