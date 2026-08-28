// Last updated: 28/08/2026, 10:23:03
1class Solution {
2
3	public int countCompleteSubstrings(String word, int k) {
4		int count = 0;
5		for (int i = 1; i <= 26; i++) {
6			count += countCompleteSubstrings(word, k, 0, i * k);
7		}
8		return count;
9	}
10
11	private int countCompleteSubstrings(String word, int k, int start, int length) {
12		if (word.length() - start < length) {
13			return 0;
14		}
15		int map[] = new int[26], count = 0, sum = 0;
16		for (int i = start; i < word.length(); i++) {
17			if (i > start && Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
18				return sum + countCompleteSubstrings(word, k, i, length);
19			}
20			count += map[word.charAt(i) - 'a'] == k - 1 ? 1 : 0;
21			count -= map[word.charAt(i) - 'a']++ == k ? 1 : 0;
22			if (i >= start + length - 1) {
23				sum += count == length / k ? 1 : 0;
24				count += map[word.charAt(i - length + 1) - 'a'] == k + 1 ? 1 : 0;
25				count -= map[word.charAt(i - length + 1) - 'a']-- == k ? 1 : 0;
26			}
27		}
28		return sum;
29	}
30}