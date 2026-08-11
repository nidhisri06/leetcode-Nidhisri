// Last updated: 11/08/2026, 20:24:29
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }
        
        return result;        
    }
}