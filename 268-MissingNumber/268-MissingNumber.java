// Last updated: 11/08/2026, 14:16:25
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,x,ans,i;
        for(i=0;i<n;i++)
        sum+=nums[i];
        x=n*(n+1)/2;
        return x-sum;  
    }
}