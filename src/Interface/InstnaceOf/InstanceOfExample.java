package Interface.InstnaceOf;



public class InstanceOfExample {
    public static void main(String[] args) {
        //구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        ride(bus);
        


    

        }
        //인터페이스 매개변수를 갖는 메소드
        public static void ride(Vehicle vehicle){
            //방법 1
            /*
            if(vehicle instanceof Bus){
                Bus bus = (Bus) vehicle;
                bus.checkFare();
            }
            */
            //방법 2
            if(vehicle instanceof Bus bus){
                bus.checkFare();
            }
        }
    }

