// Last updated: 11/08/2026, 21:42:10
1class Solution {
2    public int findTheLongestBalancedSubstring(String s) {
3        int res = 0;
4        String temp = "01";
5        while(temp.length() <= s.length()){
6            if(s.contains(temp))
7                res = temp.length();
8            temp = "0" + temp + "1";
9        }
10        return res;
11    }
12}