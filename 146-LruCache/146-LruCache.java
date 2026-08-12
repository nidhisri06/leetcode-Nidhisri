// Last updated: 12/08/2026, 19:47:18
class LRUCache extends LinkedHashMap<Integer, Integer>{
    private int capacity;
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity=capacity;
	}
	public int get(int key) {
		if (containsKey(key)) {
            return super.get(key);
        }
        return -1;
	}
	public void put(int key, int value) {
		super.put(key, value);
	}
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> oldest) {
		return size()>capacity;
	}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */