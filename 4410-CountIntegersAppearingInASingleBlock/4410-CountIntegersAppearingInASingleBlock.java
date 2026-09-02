// Last updated: 02/09/2026, 10:15:47
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> bad = new HashSet<>();
        int prev=nums[0];
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(x != prev && seen.contains(x))
                bad.add(x);
            seen.add(x);
            prev=x;
        }
        return seen.size()-bad.size();
    }
}