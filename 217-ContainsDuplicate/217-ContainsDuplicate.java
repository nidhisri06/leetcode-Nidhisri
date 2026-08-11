// Last updated: 11/08/2026, 14:16:50
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i++)
        if(nums[i]==nums[i-1]){
        return true;
        }
        return false;
        
    }
}