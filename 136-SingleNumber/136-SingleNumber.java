// Last updated: 11/08/2026, 14:17:29
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        int i,n;
        n=nums.length;
        for(i=0;i<n;i++){
        x=x^nums[i];}
        return x;  
    }
}