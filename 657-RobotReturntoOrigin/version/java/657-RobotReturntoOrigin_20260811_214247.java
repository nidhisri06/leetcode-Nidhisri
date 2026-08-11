// Last updated: 11/08/2026, 21:42:47
1class Solution {
2    private int N = 26;
3    public boolean closeStrings(String word1, String word2) {
4		// count the English letters
5        int[] arr1 = new int[N], arr2 = new int[N];
6        for (char ch : word1.toCharArray())
7            arr1[ch - 'a']++;
8        for (char ch : word2.toCharArray())
9            arr2[ch - 'a']++;
10		
11		// if one has a letter which another one doesn't have, dont exist
12        for (int i = 0; i < N; i++) {
13            if (arr1[i] == arr2[i]) {
14                continue;
15            }
16            if (arr1[i] == 0 || arr2[i] == 0) {
17                return false;
18            }
19        }
20        Arrays.sort(arr1);
21        Arrays.sort(arr2);
22        for (int i = 0; i < N; i++) {
23            if (arr1[i] != arr2[i]) {
24                return false;
25            }
26        }
27        return true;
28    }
29}