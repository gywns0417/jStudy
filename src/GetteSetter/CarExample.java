package GetteSetter;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.setSpeed(-50);
        System.out.println("현재 속도 : " + mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println("현재 속도 : " + mycar.getSpeed());

        if(!mycar.isStop()){
            mycar.setStop(true);
        }
        System.out.println("현재 속도 : " + mycar.getSpeed());
    }
}
