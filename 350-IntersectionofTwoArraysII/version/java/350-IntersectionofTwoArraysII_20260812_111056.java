// Last updated: 12/08/2026, 11:10:56
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i : nums1){
5            int freq = map.getOrDefault(i, 0);
6            map.put(i, freq + 1);
7        }
8        ArrayList<Integer> list = new ArrayList<>();
9        for(int i : nums2){
10            if(map.get(i) != null && map.get(i) > 0){
11                list.add(i);
12                map.put(i, map.get(i) - 1);
13            }
14        }
15        int[] ret = new int[list.size()]; 
16        for(int i = 0; i < list.size();i++){
17            ret[i] = list.get(i);
18        }
19        return ret;
20    }
21}