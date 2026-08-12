// Last updated: 12/08/2026, 18:02:06
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3      //lets try the brute frce approach first
4      int count=0;
5      for(int i=0;i<nums.length;i++){
6        int sum=0;
7        for(int j=i;j<nums.length;j++){
8            sum+=nums[j];
9            if(sum==k) count++;
10            
11        }
12        
13      }
14      return count;
15    }
16}