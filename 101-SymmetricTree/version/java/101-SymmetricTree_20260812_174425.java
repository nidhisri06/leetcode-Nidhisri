// Last updated: 12/08/2026, 17:44:25
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int res = 0;
4        int i = 0;
5        int j = 0;
6        Arrays.sort(g);
7        Arrays.sort(s);
8        while(i < g.length && j < s.length)
9        {
10            if(s[j] >= g[i])
11            {
12                res++;
13                i++;
14                j++;
15            }
16            else if(g[i] > s[j])
17            {
18                j++;
19            }
20        }
21        return res;
22    }
23}