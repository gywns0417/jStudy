package Etc;

public class This {
    String model;
    int speed;

    This(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        setSpeed(100);  //this 생략. 같은 객체에 속했으므로 this 없이도 호출 가능.
        System.out.println(model + "가 달립니다.(시속 : " + speed + "km/h");  //this 생략
    }

}
