// Last updated: 28/08/2026, 10:26:33
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int low = 0, high = n-1;
5        int min = Integer.MAX_VALUE;
6
7        while(low<=high){
8            int mid = low + (high-low)/2;
9
10            if(nums[low]<=nums[mid]){
11                min = Math.min(min, nums[low]);
12                low = mid+1;
13            }
14            else if(nums[mid] <= nums[high]){
15                min = Math.min(min, nums[mid]);
16                high = mid-1;
17            }
18            else if(nums[low] > nums[mid] && nums[mid] < nums[high]){
19                min = Math.min(min, nums[mid]);
20            }
21        }
22        return min; 
23    }
24}