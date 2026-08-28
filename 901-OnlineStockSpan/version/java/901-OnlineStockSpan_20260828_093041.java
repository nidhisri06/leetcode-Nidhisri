// Last updated: 28/08/2026, 09:30:41
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        int res1 = atMostK(nums, k);
4        int res2 = atMostK(nums, k - 1);
5        return res1 - res2;
6    }
7
8    public static int atMostK(int nums[], int k) {
9        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
10        int count = 0;
11        int left = 0;
12        for (int i = 0; i < nums.length; i++) {
13            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
14            while (hm.size() > k) {
15                if (hm.get(nums[left]) > 1) {
16                    hm.put(nums[left], hm.get(nums[left]) - 1);
17                } else {
18                    hm.remove(nums[left]);
19                }
20                left++;
21            }
22            count += i - left + 1;
23        }
24        return count;
25    }
26}