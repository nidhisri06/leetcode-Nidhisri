// Last updated: 12/08/2026, 18:10:21
1class Solution {
2    public int minSteps(String s, String t) {
3
4        int[] freq = new int[26];
5        for(char ch : t.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8
9        int count = 0;
10        for(char ch : s.toCharArray()) {
11            if(freq[ch - 'a'] == 0) {
12                count++;
13            }
14            if(freq[ch - 'a'] > 0) {
15                freq[ch - 'a']--;
16            }
17        }
18        return count;
19    }
20}