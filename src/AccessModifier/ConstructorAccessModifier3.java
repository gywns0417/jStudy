package AccessModifier;

public class ConstructorAccessModifier3 {

    ConstructorAccessModifier a1 = new ConstructorAccessModifier("dd");
    ConstructorAccessModifier a2 = new ConstructorAccessModifier(8);
    //ConstructorAccessModifier a3 = new ConstructorAccessModifier(7L); -> Error(private 접근제한자)

    public void method() {
        ConstructorAccessModifier a4 = new ConstructorAccessModifier();
        a4.field1 = 1;
        a4.field2 = 2;
        // a4.field3 = 3; -> private 접근 불가

        a4.method1();
        a4.method2();
        // a4.method3(); -> private 접근 불가
    }



}
