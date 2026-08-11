// Last updated: 11/08/2026, 19:14:04
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) 
3    {
4        HashMap<Integer,Integer> hmap=new HashMap<>();
5        for(int i:arr)
6            hmap.put(i,hmap.getOrDefault(i,0)+1);
7        HashSet<Integer> hset=new HashSet<>(hmap.values());
8        return hset.size()==hmap.size();
9    }
10}