// Last updated: 11/08/2026, 19:26:28
1public class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> res = new ArrayList<>();
4        List<String> cur = new ArrayList<>();
5        int num_of_letters = 0;
6
7        for (String word : words) {
8            if (word.length() + cur.size() + num_of_letters > maxWidth) {
9                for (int i = 0; i < maxWidth - num_of_letters; i++) {
10                    cur.set(i % (cur.size() - 1 > 0 ? cur.size() - 1 : 1), cur.get(i % (cur.size() - 1 > 0 ? cur.size() - 1 : 1)) + " ");
11                }
12                StringBuilder sb = new StringBuilder();
13                for (String s : cur) sb.append(s);
14                res.add(sb.toString());
15                cur.clear();
16                num_of_letters = 0;
17            }
18            cur.add(word);
19            num_of_letters += word.length();
20        }
21
22        StringBuilder lastLine = new StringBuilder();
23        for (int i = 0; i < cur.size(); i++) {
24            lastLine.append(cur.get(i));
25            if (i != cur.size() - 1) lastLine.append(" ");
26        }
27        while (lastLine.length() < maxWidth) lastLine.append(" ");
28        res.add(lastLine.toString());
29
30        return res;
31    }
32}