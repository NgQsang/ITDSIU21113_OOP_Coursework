import java.util.HashMap;
import java.util.Map;

public class MyMap<K extends Object, V extends Object> {

    private Map<K, V> map = new HashMap<>();

    public V get(K key) {
        return map.get(key);
    }

    public void put(K key, V value) {map.put(key, value);
    }
    
    public void printAllValue() {
        for (K key : map.keySet()) {
            System.out.printf("Key: %s\t-> Value: %s\n", key, map.get(key));
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        /**
         * II Question 1a. Without generic, the key and value are optional. We
         * can use whatever type we want.
         */
        MyMap mapObject = new MyMap();
        mapObject.put('1', 1);
        mapObject.put('2', 2);
        mapObject.put(2, "KeyInteger");
        mapObject.put("SOMEKEY", 9.2328);
        mapObject.printAllValue();
        /**
         * II Question 1b. With generic, the type are strictly checked during
         * runtime, and will throw Exception if the type checking failed.
         */
        MyMap<Integer, String> mapGeneric = new MyMap();
        mapGeneric.put(1, "1");
        mapGeneric.put(2, "2");
        try {
            mapGeneric.put(3, "3");
        } catch (RuntimeException e) {
            System.out.println("Map putting ERROR at key \"3\"");
        }
        mapGeneric.printAllValue();
        /**
         * II Question 2b. Using generic type allow us to eliminate the casting
         * of Object instances. Thus more efficient in runtime.
         */
        /**
         * II Question 2c. Using parameterized type allow us to strictly
         * checking type of the values. Thus eliminating the inconsistence of
         * the data.
         */
    }
}
