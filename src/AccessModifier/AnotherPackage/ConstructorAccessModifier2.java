package AccessModifier.AnotherPackage;

import AccessModifier.ConstructorAccessModifier;

public class ConstructorAccessModifier2 {
    ConstructorAccessModifier a1 = new ConstructorAccessModifier("asd");
    // ConstructorAccessModifier a2 = new ConstructorAccessModifier(7); -> default 접근제한자
    // ConstructorAccessModifier a3 = new ConstructorAccessModifier(6L); -> private 접근제한자

    public void method(){
        ConstructorAccessModifier a4 = new ConstructorAccessModifier();
        a4.field1 = 1;
        // a4.filed2 = 2; -> default 접근 불가
        // a4.field3 = 3; -> private 접근 불가

        a4.method1();
        // a4.method2(); -> default 접근 불가
        // a4.method3(); -> private 접근 불가

    }
}
