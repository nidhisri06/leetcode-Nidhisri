// Last updated: 12/08/2026, 19:31:40
1class LRUCache extends LinkedHashMap<Integer, Integer>{
2    private int capacity;
3	public LRUCache(int capacity) {
4		super(capacity, 0.75f, true);
5		this.capacity=capacity;
6	}
7	public int get(int key) {
8		if (containsKey(key)) {
9            return super.get(key);
10        }
11        return -1;
12	}
13	public void put(int key, int value) {
14		super.put(key, value);
15	}
16	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> oldest) {
17		return size()>capacity;
18	}
19}
20
21/**
22 * Your LRUCache object will be instantiated and called as such:
23 * LRUCache obj = new LRUCache(capacity);
24 * int param_1 = obj.get(key);
25 * obj.put(key,value);
26 */