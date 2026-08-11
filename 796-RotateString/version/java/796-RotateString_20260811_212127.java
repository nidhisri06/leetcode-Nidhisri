// Last updated: 11/08/2026, 21:21:27
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        return (s + s).contains(goal);
7    }
8}