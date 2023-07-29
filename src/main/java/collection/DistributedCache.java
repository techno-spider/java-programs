package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistributedCache<K, V> {

    private final int capacity;
    private final Map<K, V> cache;

    public DistributedCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void put(K key, V value) {
        if (cache.size() >= capacity) {
            K ruKey = cache.keySet().iterator().next();
            cache.remove(ruKey);
        }
        cache.put(key, value);
    }

    public int size() {
        return cache.size();
    }

    public void clear() {
        cache.clear();
    }

    public static void main(String[] args) {
        DistributedCache<String, Integer> cache = new DistributedCache<>(3);

        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.put("M", 7);
        System.out.println("Cache size: " + cache.size());

        cache.put("D", 4);
        System.out.println("Cache size: " + cache.size());
        System.out.println("Value of key 'D': " + cache.get("D"));
        System.out.println("Value of key 'B': " + cache.get("B"));
    }
}
