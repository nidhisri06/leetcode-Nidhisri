// Last updated: 12/08/2026, 18:19:48
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int start = Integer.MIN_VALUE, end = 0;
4        for (int num : nums) {
5            start = Math.max(start, num);
6            end += num;
7        }
8        int ans = 0;
9        
10        while (start <= end) {
11            int mid = start + (end - start) / 2;
12            int subarrays = 1, currSum = 0;
13            
14            for (int num : nums) {
15                if (currSum + num > mid) {
16                    subarrays++;
17                    currSum = num;
18                } else {
19                    currSum += num;
20                }
21            }
22            
23            if (subarrays <= k) {
24                ans = mid;
25                end = mid - 1;
26            } else {
27                start = mid + 1;
28            }
29        }
30        
31        return ans;
32    }
33}