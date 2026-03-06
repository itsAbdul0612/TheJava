package JavaGenerics;

public class Key_n_Value<K, V> {

    private K key;
    private V value;

    public Key_n_Value(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
