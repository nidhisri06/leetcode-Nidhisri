// Last updated: 11/08/2026, 19:15:09
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        byte[] freq = new byte[101];
4        byte max = 0, res = 0;
5        for (int n : nums) {
6            byte f = ++freq[n];
7            if (f > max) {
8                max = f; res = f;
9            } else if (f == max) 
10                res += f;
11        }
12        return res;
13    }
14}
15