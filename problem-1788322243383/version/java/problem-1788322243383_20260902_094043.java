// Last updated: 02/09/2026, 09:40:43
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4        HashSet<Integer> bad = new HashSet<>();
5        int prev=nums[0];
6        for(int i=0;i<nums.length;i++){
7            int x = nums[i];
8            if(x != prev && seen.contains(x))
9                bad.add(x);
10            seen.add(x);
11            prev=x;
12        }
13        return seen.size()-bad.size();
14    }
15}