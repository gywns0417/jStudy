public class NullPointerExceptionTest {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; //NullPointerException Error
        // intArray가 힙 메모리에 참조할 수 있는 객체가 없음
    }
}