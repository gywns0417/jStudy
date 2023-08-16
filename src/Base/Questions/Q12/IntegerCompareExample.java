package Base.Questions.Q12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        // int, short, byte 포장값은 -128~127 사이의 값은 == 를 사용해 비교할 수 있다.
        // == 는 객체에 사용될 경우 객체의 번지를 비교하는 연산자이다.

        System.out.println(obj1 == obj2);
        System.out.println(obj3.equals(obj4));
    }
}
