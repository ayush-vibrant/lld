package questions.hashmap;

public class Entry<K, V> {
    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Entry<K, V> kvEntry) {
        this.next = kvEntry;
    }
}
