package Protected;

public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
        //같은 패키지이므로 A의 protected 필드, 생성자, 메소드 접근 가능
    }
}
