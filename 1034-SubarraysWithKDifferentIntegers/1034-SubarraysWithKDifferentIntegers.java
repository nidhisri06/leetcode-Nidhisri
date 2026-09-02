// Last updated: 02/09/2026, 10:18:11
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res1 = atMostK(nums, k);
        int res2 = atMostK(nums, k - 1);
        return res1 - res2;
    }

    public static int atMostK(int nums[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            while (hm.size() > k) {
                if (hm.get(nums[left]) > 1) {
                    hm.put(nums[left], hm.get(nums[left]) - 1);
                } else {
                    hm.remove(nums[left]);
                }
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }
}