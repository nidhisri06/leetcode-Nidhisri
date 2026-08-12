// Last updated: 12/08/2026, 19:42:15
class Solution {
    int MOD = 1000000007;
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long[] dest = new long[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                dest[i] = (long)nums[i] - d;
            } else {
                dest[i] = (long)nums[i] + d;
            }
        }
        Arrays.sort(dest);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res = (res + dest[i] * i) % MOD;
            res = (res - dest[i] * (n-i-1) + MOD) % MOD;
        }
        return (int)res;
    }
}