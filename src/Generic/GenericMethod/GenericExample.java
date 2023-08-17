package Generic.GenericMethod;

public class GenericExample {
    // 제네릭 메소드
    public static <T> Box<T> boxing(T t) { //public static 타입 파라미터 정의 | 반환 타입 설정 | 메소드 명(매개변수)
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        // 제네릭 메소드 호출
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
