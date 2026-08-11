// Last updated: 11/08/2026, 21:55:17
1class Solution {
2    public int vowelStrings(String[] words, int left, int right) {
3        int count = 0;
4        String v = "aeiou";
5        for(int i=left; i<=right; i++){
6            if(v.contains(words[i].charAt(0)+"") && v.contains(words[i].charAt(words[i].length()-1)+""))   count++;
7        }
8        return count;
9    }
10}