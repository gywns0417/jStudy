package Polymorphism.Parameter;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //매개값으로 자식 클래스인 Bus 객체 제공
        Bus bus = new Bus();
        driver.drive(bus);

        //매개값으로 자식 클래스인 Taxi 객체 제공

        Taxi taxi = new Taxi();
        driver.drive(taxi);

        //자동 타입 변환
        Vehicle vehicle = new Bus();
        driver.drive(vehicle);

        //강제 타입 변환
        vehicle = (Bus) new Bus();
        driver.drive(vehicle);
    }
}
