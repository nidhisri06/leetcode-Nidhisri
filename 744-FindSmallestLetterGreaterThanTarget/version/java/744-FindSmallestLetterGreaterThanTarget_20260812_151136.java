// Last updated: 12/08/2026, 15:11:36
1class Solution {
2    public int[] sortedSquares(int[] nums) {    
3        int i = 0;
4        int j = nums.length - 1;
5        int k = j;
6
7        int[] newL = new int[nums.length];
8
9        while (i < j) {
10            int iSquare = nums[i] * nums[i];
11            int jSquare = nums[j] * nums[j];
12
13            if (iSquare > jSquare) {
14                newL[k--] = iSquare;
15                i++;
16            } else {
17                newL[k--] = jSquare;
18                j--;
19            }
20        }
21
22        newL[0] = nums[i] * nums[i];
23        return newL;
24    }
25}