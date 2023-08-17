package Generic.GenericType3;

public class Box <T> {
    public T content;
    
    // 박스의 내용물이 같은지 비교
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
