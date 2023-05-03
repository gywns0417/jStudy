package MethodOverloadig;

public class MethodOverloadingExampleRun {
    public static void main(String[] args) {
        MethodOverloadingExample mo = new MethodOverloadingExample();
        double result1 = mo.areaRectangle(10);
        double result2 = mo.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
