package questions.hashmap;

import java.util.HashMap;

public class MyHashMap<K, V> {
    private final int INITIAL_CAPACITY = 16;
    private int tableSize = 16;
    private final int MAX_CAPACITY = 1 << 30; // this is equivalent to 2^30

    private Entry[] table;

    public MyHashMap(int capacity) {
        this.tableSize = getTableSizeFor(capacity);
        this.table = new Entry[tableSize];
    }

    public MyHashMap() {
        this.table = new Entry[INITIAL_CAPACITY];
    }

    // How this method works?
    // Watch https://www.youtube.com/watch?v=AsAymWn7D40&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=13

    /**
     * WHY DO WE EVEN NEED THIS METHOD?
     * <p>
     * Having a hash size that is a power of 2 reduces collisions in a hash table implementation because it takes advantage of the way that the bitwise AND operation works.
     * <p>
     * In a hash table, the goal is to distribute the keys evenly across the available buckets to minimize collisions. When a key is inserted into the hash table, it is hashed to determine which bucket it should be placed in. The hash function produces a hash code for the key, which is an integer value that is used to index into the array of buckets.
     * <p>
     * To map a hash code to a bucket index, the hash table implementation typically uses the modulus operator to compute the remainder of the hash code divided by the number of buckets. For example, if the hash code is 123 and there are 10 buckets, then the bucket index would be 123 % 10 = 3.
     * <p>
     * However, taking the modulus of a hash code can result in collisions if the hash codes are not distributed evenly across the range of possible values. For example, if the hash codes are all multiples of 10 and there are 10 buckets, then all the keys would be placed in the same bucket, resulting in poor performance.
     * <p>
     * To avoid this issue, many hash table implementations use a bitwise AND operation instead of the modulus operator to compute the bucket index. Specifically, they use the expression hashcode & (n-1) to compute the bucket index, where n is the size of the hash table (i.e., the number of buckets). Since n is a power of 2, subtracting 1 from n produces a binary number consisting of all 1s. For example, if n is 8, then n-1 is 7, which is 111 in binary.
     * <p>
     * The bitwise AND operation with a power of 2 minus 1 results in a hash value that is always less than the size of the hash table. This ensures that the bucket index is always within the valid range of bucket indices.
     * <p>
     * Furthermore, because the binary representation of a power of 2 minus 1 has all bits set to 1, it means that the least significant bits of the hash code are used to compute the bucket index. This effectively distributes the keys across the available buckets, reducing collisions.
     * <p>
     * In summary, using a hash size that is a power of 2 simplifies the computation of bucket indices using bitwise AND, which helps distribute keys across buckets and reduces collisions.
     * <p>
     * Let me try to explain this in a bit more detail.
     * <p>
     * When a hash table uses bitwise AND to compute the bucket index, it takes advantage of the fact that the binary representation of a power of 2 minus 1 has all bits set to 1. For example, if the hash table size is 8 (i.e., there are 8 buckets), then the binary representation of 8 minus 1 (i.e., 7) is 111 in binary.
     * <p>
     * To see why this is useful, consider a hash function that produces a hash code with a binary representation of 101101. When we take the bitwise AND of this hash code with 7 (i.e., 111 in binary), we get:
     * <p>
     * Copy code
     * 101101
     * AND
     * 000111
     * =
     * 000101
     * The resulting binary value 101 is the bucket index that the key should be placed in. Notice that the bucket index is determined by the least significant bits of the hash code (i.e., the bits on the right), which correspond to the bits in the binary representation of the hash table size minus 1.
     * <p>
     * By using the least significant bits to compute the bucket index, the hash table can effectively distribute keys across the available buckets, reducing collisions. For example, if the hash table size is 8, then there are 8 possible bucket indices: 0, 1, 2, 3, 4, 5, 6, and 7. Because the bitwise AND operation with 7 (i.e., 111 in binary) only looks at the least significant 3 bits of the hash code, it effectively maps keys to one of these 8 possible bucket indices.
     * <p>
     * In contrast, if the hash table size were 9, then there would be 9 possible bucket indices: 0, 1, 2, 3, 4, 5, 6, 7, and 8. However, taking the bitwise AND of a hash code with 8 (i.e., 1000 in binary) would only look at the least significant 3 bits, which would effectively map keys to one of the 8 possible bucket indices (i.e., 0, 1, 2, 3, 4, 5, 6, or 7). This would leave one bucket (i.e., bucket 8) unused, which would waste space and potentially increase collisions.
     * <p>
     * Therefore, by using a hash table size that is a power of 2 minus 1, the hash table implementation can effectively distribute keys across the available buckets, reducing collisions and maximizing space utilization.
     **/
    private int getTableSizeFor(int capacity) {
        capacity = capacity - 1;
        capacity = capacity | (capacity >>> 1);
        capacity = capacity | (capacity >>> 2);
        capacity = capacity | (capacity >>> 4);
        capacity = capacity | (capacity >>> 8);
        capacity = capacity | (capacity >>> 16);
        return (capacity < 0) ? 1 : (capacity >= MAX_CAPACITY) ? MAX_CAPACITY : capacity + 1;
    }

    public void put(K key, V value) {
        // You can even improve this by using ^ (tableSize >>> 16) :: look at java hashmap class hash(Object key) method
        int hashCode = key.hashCode() & (tableSize - 1);
        Entry<K, V> entry = table[hashCode];
        if (entry == null) {
            table[hashCode] = new Entry<>(key, value, null);
        } else {
            while (true) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
                if (entry.getNext() == null) {
                    entry.setNext(new Entry<>(key, value, null));
                    return;
                }
                entry = entry.getNext();
            }

        }
    }

    public V get(K key) throws RuntimeException {
        int hashCode = key.hashCode() & (tableSize - 1);
        Entry<K, V> entry = table[hashCode];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.getNext();
        }
        throw new RuntimeException("Key not found");
    }

}

