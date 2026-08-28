// Last updated: 28/08/2026, 09:36:39
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        Stack<String> st = new Stack<>();
6
7        for (int i = 2 * n - 1; i >= 0; i--) {
8            while (!st.isEmpty() && Integer.parseInt(st.peek()) <= nums[i % n])
9                st.pop();
10
11            if (i < n)
12                ans[i] = st.isEmpty() ? -1 : Integer.parseInt(st.peek());
13
14            st.push(String.valueOf(nums[i % n]));
15        }
16
17        return ans;
18    }
19}