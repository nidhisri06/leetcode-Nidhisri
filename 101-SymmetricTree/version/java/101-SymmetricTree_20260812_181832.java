// Last updated: 12/08/2026, 18:18:32
1class RandomizedSet {
2    private List<Integer> list;
3    private Map<Integer, Integer> map;
4    private Random random;
5
6    public RandomizedSet() {
7        list = new ArrayList<>();
8        map = new HashMap<>();
9        random = new Random();
10    }
11    
12    public boolean insert(int val) {
13        if (map.containsKey(val)) {
14            return false;
15        }
16        map.put(val, list.size());
17        list.add(val);
18        return true;
19    }
20    
21    public boolean remove(int val) {
22        if (!map.containsKey(val)) {
23            return false;
24        }
25        int lastElement = list.get(list.size() - 1);
26        int indexToRemove = map.get(val);
27        
28        list.set(indexToRemove, lastElement);
29        map.put(lastElement, indexToRemove);
30        
31        list.remove(list.size() - 1);
32        map.remove(val);
33        
34        return true;
35    }
36    
37    public int getRandom() {
38        return list.get(random.nextInt(list.size()));
39    }
40}
41
42/**
43 * Your RandomizedSet object will be instantiated and called as such:
44 * RandomizedSet obj = new RandomizedSet();
45 * boolean param_1 = obj.insert(val);
46 * boolean param_2 = obj.remove(val);
47 * int param_3 = obj.getRandom();
48 */