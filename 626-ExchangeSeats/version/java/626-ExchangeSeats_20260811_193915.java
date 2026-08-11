// Last updated: 11/08/2026, 19:39:15
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum= nums[0];
4        for(int i = 1; i < nums.length;i++){
5            if(nums[i] == (nums[i-1]+1)){
6                sum+=nums[i];
7            }else{
8                break;
9            }
10        }
11
12        Set<Integer> s = new HashSet<>();
13        for(int i : nums){
14            if(i >= sum){
15                s.add(i);
16            }
17        }
18        while(s.contains(sum)){
19                sum++;
20        }
21        return sum;
22    }
23}