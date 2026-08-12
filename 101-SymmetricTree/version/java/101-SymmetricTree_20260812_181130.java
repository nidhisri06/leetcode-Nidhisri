// Last updated: 12/08/2026, 18:11:30
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for (char c : word.toCharArray()) freq[c - 'a']++;
5
6        Arrays.sort(freq);
7
8        int ans = 0;
9        int pos = 0;
10
11        for (int i = 25; i >= 0; i--) {
12            if (freq[i] == 0) break;
13            ans += freq[i] * (pos / 8 + 1);
14            pos++;
15        }
16
17        return ans;
18    }
19}