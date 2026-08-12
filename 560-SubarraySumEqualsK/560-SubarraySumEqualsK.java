// Last updated: 12/08/2026, 18:29:48
class Solution {
    public int subarraySum(int[] nums, int k) {
      //lets try the brute frce approach first
      int count=0;
      for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(sum==k) count++;
            
        }
        
      }
      return count;
    }
}