// Last updated: 11/08/2026, 21:56:40
1class Solution {
2    public int removePalindromeSub(String s) {
3        if(isPalindromic(s)) return 1;
4        return 2;
5    }
6
7    static boolean isPalindromic(String s){
8        int n = s.length();
9        int l = 0, r = n - 1;
10
11        while(l <= r){
12            if(s.charAt(l) != s.charAt(r)){
13                return false;
14            }
15            l++;
16            r--;
17        }
18
19        return true;
20    }
21}