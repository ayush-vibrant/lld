package questions.hashmap;

public class MyHashMapApplication {
    public static void main(String[] args) throws RuntimeException {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");


        try {
            Object value = hashMap.get("key90");
            System.out.println(value);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
