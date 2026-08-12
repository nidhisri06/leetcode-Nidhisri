// Last updated: 12/08/2026, 19:35:04
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int numsLength = nums.length;
4        int prefixProduct = 1;
5        int suffixProduct = 1;
6        int[] result = new int[numsLength];
7        for(int i = 0; i < numsLength; i++) {
8            result[i] = prefixProduct;
9            prefixProduct *= nums[i];
10        }
11        for(int i = numsLength-1; i >= 0; i--) {
12            result[i] *= suffixProduct;
13            suffixProduct *= nums[i];
14        }
15        return result;
16    }
17}