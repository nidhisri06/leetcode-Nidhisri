// Last updated: 11/08/2026, 19:17:26
1import java.util.*;
2
3class Solution {
4    public String longestWord(String[] words) {
5        Arrays.sort(words);
6        
7        Set<String> st = new HashSet<>();
8        st.add("");
9        String longest = "";
10        
11        for (String word : words) {
12            String prefix = word.substring(0, word.length() - 1);
13            
14            if (st.contains(prefix)) {
15                st.add(word);
16                if (word.length() > longest.length()) {
17                    longest = word;
18                }
19            }
20        }
21        
22        return longest;
23    }
24}