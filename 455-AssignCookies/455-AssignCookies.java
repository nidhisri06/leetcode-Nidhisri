// Last updated: 12/08/2026, 18:30:14
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < g.length && j < s.length)
        {
            if(s[j] >= g[i])
            {
                res++;
                i++;
                j++;
            }
            else if(g[i] > s[j])
            {
                j++;
            }
        }
        return res;
    }
}