package Base.Wrapper;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue()); // Integer 객체 내부의 int 값 리턴

        // Unboxing
        int value = obj;
        System.out.println("value : " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("value : " + result);
    }
}
