package Protected.package2;

import Protected.A;

public class D extends A {
    //생성자 선언
    public D(){
        super(); //부모 생성자 호출
    }
    public void method1(){
        //A 필드값 변경
        this.field = "value";
        //A 메소드 호출
        this.method();
    }
    // 상속을 통해서만 사용 가능하다.

    public void method2(){
        /*
        A a = new A();
        a.field = "value";
        a.method();
        // 직접 객체 생성해서 사용은 불가
         */
    }
}
