// Last updated: 12/08/2026, 15:12:22
1class Solution {
2    public double findMaxAverage(int[] nums, int k) 
3    {
4        int sum = 0;
5        int left = 0;
6        double maxSum = Integer.MIN_VALUE;
7        
8
9        for(int right = 0; right < nums.length; right++)
10        {
11            sum = sum + nums[right];
12
13            if((right - left + 1) == k)
14            {
15                maxSum = Math.max(maxSum, sum);
16                sum = sum - nums[left];
17                left++;
18            }
19          
20        }
21        double maxAvg = maxSum/k;
22        return maxAvg;
23    }
24}