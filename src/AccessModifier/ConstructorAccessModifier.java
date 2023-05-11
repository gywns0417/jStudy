package AccessModifier;


public class ConstructorAccessModifier {

    public int field1;
    int field2;
    private int field3;

    public ConstructorAccessModifier(){
        field1 = 1;
        field2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();

        //클래스 내부일 경우 접근 제한자 영향x
    }

    ConstructorAccessModifier a1 = new ConstructorAccessModifier("dd");
    ConstructorAccessModifier a2 = new ConstructorAccessModifier(8);
    ConstructorAccessModifier a3 = new ConstructorAccessModifier(9L);

    public ConstructorAccessModifier(String a) {}

    ConstructorAccessModifier(int a) {}

    private ConstructorAccessModifier(long a) {}

    public void method1() {}

    void method2() {}

    private void method3() {}


}
