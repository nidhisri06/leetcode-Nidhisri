// Last updated: 11/08/2026, 19:40:40
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        List<Integer> evenNumbers = new ArrayList<>();
4        List<Integer> oddNumbers = new ArrayList<>();
5        
6        // Separate even and odd numbers
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] % 2 == 0)
9                evenNumbers.add(nums[i]);  // Even number found
10            else
11                oddNumbers.add(nums[i]);   // Odd number found
12        }
13        
14        // Combine even and odd numbers, placing even numbers first
15        for (int num : oddNumbers) {
16            evenNumbers.add(num);
17        }
18        
19        // Convert List to int[]
20        int[] result = new int[evenNumbers.size()];
21        for (int i = 0; i < evenNumbers.size(); i++) {
22            result[i] = evenNumbers.get(i);
23        }
24        
25        return result;  // Return the sorted array
26    }
27}