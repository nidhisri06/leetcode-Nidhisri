// Last updated: 11/08/2026, 21:41:16
1import java.util.*;
2
3class Solution {
4    public List<Integer> findWordsContaining(String[] words, char x) {
5        List<Integer> result = new ArrayList<>();
6        for (int i = 0; i < words.length; i++) {
7            if (words[i].indexOf(x) != -1) {
8                result.add(i);
9            }
10        }
11        return result;
12    }
13}