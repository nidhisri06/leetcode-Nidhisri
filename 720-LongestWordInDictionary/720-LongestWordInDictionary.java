// Last updated: 11/08/2026, 19:44:16
import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        
        Set<String> st = new HashSet<>();
        st.add("");
        String longest = "";
        
        for (String word : words) {
            String prefix = word.substring(0, word.length() - 1);
            
            if (st.contains(prefix)) {
                st.add(word);
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }
        
        return longest;
    }
}