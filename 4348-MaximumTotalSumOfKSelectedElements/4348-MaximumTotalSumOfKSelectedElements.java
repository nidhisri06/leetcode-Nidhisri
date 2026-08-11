// Last updated: 11/08/2026, 14:13:38
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans =0;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            ans+=Math.max((long) nums[i],(long)nums[i]*mul);
            mul--;
        }
        return ans;
        
    }
}