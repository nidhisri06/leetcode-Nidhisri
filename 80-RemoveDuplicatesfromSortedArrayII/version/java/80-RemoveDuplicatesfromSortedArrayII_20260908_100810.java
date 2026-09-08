// Last updated: 08/09/2026, 10:08:10
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n1 = s1.length();
4        int n2 = s2.length();
5        if(n2<n1) return false;
6        int [] count1 = new int[26];
7        int [] count2 = new int[26];
8        for(int i=0;i<n1;i++){
9            count1[s1.charAt(i)-'a']++;
10            count2[s2.charAt(i)-'a']++;
11        }
12        if(Arrays.equals(count1,count2)) return true;
13        for(int i=n1;i<n2;i++){
14            count2[s2.charAt(i)-'a']++;
15            count2[s2.charAt(i-n1)-'a']--;
16            if(Arrays.equals(count1,count2)) return true;
17        }
18        return false;
19    }
20}