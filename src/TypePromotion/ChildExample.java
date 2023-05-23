package TypePromotion;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        //Parent 타입으로 필드와 메소드 사용
        parent.field1 = "value";
        parent.method1();
        parent.method2();
        /*
        parent.field2 = "value2"; //불가능
        parent.method3(); // 불가능
         */

        //강제 타입 변환
        Child child = (Child) parent;
        //Child 타입으로 필드와 메소드 사용 가능
        child.field2 = "value2";
        child.method3();
    }
}
