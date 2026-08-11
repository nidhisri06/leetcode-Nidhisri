// Last updated: 11/08/2026, 21:33:58
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int res=-1;
4        HashMap<Character,Integer> hm=new HashMap<>();
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(hm.containsKey(c))
8                res=Math.max(res,i-hm.get(c)-1);
9            else
10                hm.put(c,i);
11        }
12
13        return res;
14    }
15}