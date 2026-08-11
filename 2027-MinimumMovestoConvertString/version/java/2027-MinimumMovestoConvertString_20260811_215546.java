// Last updated: 11/08/2026, 21:55:46
1class Solution {
2    public int minimumMoves(String s) {
3        int i=0;
4        int step=0;
5        while(i<s.length()){
6            if(s.charAt(i)=='X'){
7                i=i+3;
8                step++;
9            }
10            else{
11                i++;
12            }
13        }
14        return step;
15    }
16}