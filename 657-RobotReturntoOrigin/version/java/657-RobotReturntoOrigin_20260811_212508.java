// Last updated: 11/08/2026, 21:25:08
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3       return Subsequence(s , 0 , t , 0);
4    }
5    public static boolean Subsequence(String s , int i , String t , int j){
6        if( i == s.length()){
7            return true;
8        }
9        if(j == t.length()){
10            return false;
11        }
12        if(s.charAt(i) == t.charAt(j)){
13            return Subsequence(s , i+1 , t , j+1);
14        }
15        return Subsequence(s , i , t , j+1);
16    }
17}