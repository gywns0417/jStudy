package NestedClass.Questions.Q6;

public class Anonymous {
    Vehicle field = new Vehicle() { //필드에 익명 구현 객체 대입
        public void run() {
            System.out.println("자전거가 달립니다.");
        };
    };

    void method1() {
        Vehicle localVar = new Vehicle() { //메소드에 익명 구현 객체 대입
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };

        localVar.run();
    }

    void method2(Vehicle v) { //매개변수에 익명 구현 객체 대입
        v.run();
    }
}
