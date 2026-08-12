// Last updated: 12/08/2026, 17:54:48
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int maximumSetSize(int[] v1, int[] v2) {
6        Set<Integer> s1 = new HashSet<>();
7        Set<Integer> s2 = new HashSet<>();
8        for (int i : v1)
9            s1.add(i);
10        for (int i : v2)
11            s2.add(i);
12        int n = v1.length, m = v2.length;
13        int x = s1.size(), y = s2.size();
14        int ans = Math.min(n / 2, x);
15        int rem = x - ans;
16        int c = 0;
17        for (int i : s2) {
18            if (!s1.contains(i)) {
19                c++;
20            } else if (rem > 0) {
21                c++;
22                rem--;
23            }
24            if (c >= m / 2)
25                break;
26        }
27        return ans + c;
28    }
29}
30