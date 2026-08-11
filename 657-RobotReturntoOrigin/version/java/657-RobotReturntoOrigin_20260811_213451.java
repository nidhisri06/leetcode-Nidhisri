// Last updated: 11/08/2026, 21:34:51
1public class Solution {
2    public boolean halvesAreAlike(String s) {
3        Set<Character> vowels = new HashSet<>();
4        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
5        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
6
7        int length = s.length();
8        int midPoint = length / 2;
9
10        String firstHalf = s.substring(0, midPoint);
11        String secondHalf = s.substring(midPoint);
12
13        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
14    }
15
16    private int countVowels(String str, Set<Character> vowels) {
17        int count = 0;
18        for (char c : str.toCharArray()) {
19            if (vowels.contains(c)) {
20                count++;
21            }
22        }
23        return count;
24    }
25}