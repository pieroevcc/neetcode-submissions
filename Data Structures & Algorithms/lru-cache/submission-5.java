class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int cap = 0;


    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
        this.cap = capacity;
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if (map.size() == cap && !map.containsKey(key)){
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }
}
