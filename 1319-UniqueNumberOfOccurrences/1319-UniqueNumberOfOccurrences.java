// Last updated: 11/08/2026, 19:43:16
class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        HashSet<Integer> hset=new HashSet<>(hmap.values());
        return hset.size()==hmap.size();
    }
}