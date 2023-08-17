package Generic.Questions.Q3;

public class Container <K, M>{
    public K key;
    public M value;

    public K getKey() {
        return key;
    }
    public void set(K key, M value) {
        this.key = key;
        this.value = value;
    }
    public M getValue() {
        return value;
    }
}
