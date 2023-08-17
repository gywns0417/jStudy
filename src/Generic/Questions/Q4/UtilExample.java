package Generic.Questions.Q4;
// 다음 Util 클래스의 정적 getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고, 두 번째 매개값으로 키값을 받는다. 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고,
// 일치하지 않으면 null을 리턴하도록 Util 클래스와 getValue() 제네릭 메소드를 작성하라.

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String,Integer>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<String,Integer>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순");
        System.out.println(childAge);
    }
}
