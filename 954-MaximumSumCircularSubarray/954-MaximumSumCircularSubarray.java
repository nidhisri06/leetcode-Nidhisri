// Last updated: 12/08/2026, 18:28:12
class Solution {
/*  ==== TLE ==== Time : O(n ^ 2)
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        for(int i = 0; i < n - 1; i++) {
            currentSum = nums[i % n];
            for(int j = 1; j < n; j++) {
                currentSum = Math.max(nums[(i + j) % n], currentSum + nums[(i + j) % n]);

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
*/

    // Time : O(n)
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }

        int minSum = nums[0];
        int currentMin = nums[0];

        for(int i = 1;  i < n; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        int ans = (minSum == totalSum) ? minSum : totalSum - minSum;

        return Math.max(maxSum, ans);
    }
}