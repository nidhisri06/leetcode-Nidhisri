// Last updated: 11/08/2026, 21:36:20
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        if(sentence.length()<26)
4        {
5            return false;
6        }
7        for(int ch='a';ch<='z';ch++)
8        {
9            if(sentence.indexOf(ch)<0)
10            {
11                return false;
12            }
13        }
14        return true;
15    }
16}