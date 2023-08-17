package Generic.Questions.Q2;
//ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있다. main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언하라.

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
    }
    
}
